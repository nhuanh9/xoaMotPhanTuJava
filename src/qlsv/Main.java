package qlsv;

public class Main {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        manageStudent.add(new Student(111, "Cường Đô Na", 29));
        manageStudent.add(new Student(1222, "Sơn Đô Na", 22));
        manageStudent.add(new Student(1222, "Sơn Đô Na", 23));
        manageStudent.add(new Student(1222, "Sơn Đô Na", 2222));
        manageStudent.add(new Student(1222, "Sơn Đô Na", 12));
        manageStudent.add(new Student(1222, "Sơn Đô Na", 22));
        manageStudent.display();
        manageStudent.edit("Cường Đô Na", new Student(22, "Chương CC", 95));
        manageStudent.display();
//        manageStudent.delete("Sơn Đô Na");
//        manageStudent.display();
        manageStudent.sortByAge();
        manageStudent.display();
    }
}
