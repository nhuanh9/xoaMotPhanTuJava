package QLSP;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MFCSV {
    void writeFile(String path, List<Person> personList) throws IOException {
        FileWriter fr = new FileWriter(path);
        BufferedWriter bf = new BufferedWriter(fr);
        String str = "id, name, age\n";
        for (int i = 0; i < personList.size(); i++) {
            str += personList.get(i).getId() + "," + personList.get(i).getName() + "," + personList.get(i).getAge() + "\n";
        }
        bf.write(str);
        bf.close();
        fr.close();
    }

    List<Person> readFile(String path) throws IOException {
        List<Person> people = new ArrayList<>();
        FileReader fw = new FileReader(path);
        BufferedReader bw = new BufferedReader(fw);;
        String content = bw.readLine();
        while ((content = bw.readLine()) != null) {
            String[] values = content.split(",");
            people.add(new Person(Integer.parseInt(values[0]), values[1], Integer.parseInt(values[2])));
        }
        return people;
    }
}
