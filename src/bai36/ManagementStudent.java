package bai36;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class ManagementStudent {
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public ManagementStudent() {
        this.studentList = new ArrayList<>();
    }

    public List<Student> getAll() {
        return this.studentList;
    }

    public void add(Student student) {
        this.studentList.add(student);
    }

    public boolean checkExistedId(String id) {
        for (int i = 0; i < this.studentList.size(); i++) {
            if (this.studentList.get(i).getId().equals(id)) {
                return false;
            }
        }
        return true;
    }

    public int findById(String id) {
        for (int i = 0; i < this.studentList.size(); i++) {
            if (this.studentList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void delete(String id) {
        this.studentList.remove(findById(id));
    }

    public void edit(Student student) {
        this.studentList.set(findById(student.getId()), student);
    }

    public void sort() {
        Collections.sort(this.studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    }

    public void writeToFile() throws IOException {
        FileStudent.writeToFile("b36.csv", this.studentList);
        System.out.println("Thêm thành công :)))");
    }

    public void readFromFile() throws IOException {
        this.studentList = FileStudent.readFromFile("b36.csv");
        System.out.println("Đọc xong :)))");
    }
}
