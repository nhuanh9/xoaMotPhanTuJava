package QLSP;

import java.io.*;

public class RWFile {
    public static void writeToFile(String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("id,name,age\n12,NAL,22\n132,NAL,22\n1231,NAL,22\n1123,NAL,22\n13123,NAL,22\n1,NAL,22");
        bufferedWriter.close();
        fileWriter.close();
    }

    public static void readFromFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader br = new BufferedReader(fileReader);
        String res ;
        while ((res = br.readLine()) !=null) {
            System.out.println(res);
        }
        br.close();
        fileReader.close();
    }

    public static void main(String[] args) throws IOException {
        RWFile.writeToFile("demo.csv");
        readFromFile("demo.csv");

    }
}
