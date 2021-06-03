package bai36;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileStudent {
    public static void writeToFile(String path, List<Student> students) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "id,name,dateOfBirth\n";
        for (Student s : students) {
            str += s.getId() + "," + s.getName() + "," + s.getDateOfBirth() + "\n";
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriter.close();
    }

    public static List<Student> readFromFile(String path) throws IOException {
        List<Student> students = new ArrayList<>();
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String content = bufferedReader.readLine();
        while ((content = bufferedReader.readLine()) != null) {
            String[] values = content.split(",");
            String[] date = values[2].split("-");
            students.add(new Student(values[0], values[1], LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]))));
        }
        return students;
    }
}
