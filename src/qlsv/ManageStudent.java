package qlsv;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ManageStudent {
    ArrayList<Student> students;

    public ManageStudent() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
    }

    public void display() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("----------------------------");
    }

    public int findByName(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void edit(String name, Student student) {
        int indexOfStudent = findByName(name);
        if (indexOfStudent == -1) {
            System.out.println("Không có :)))");
        } else {
            students.set(indexOfStudent, student);
        }
    }

    public void delete(String name) {
        int indexOfStudent = findByName(name);
        if (indexOfStudent == -1) {
            System.out.println("Không có :)))");
        } else {
            students.remove(indexOfStudent);
        }
    }

    public void sortByAge() {
        Collections.sort(this.students);
    }

}
