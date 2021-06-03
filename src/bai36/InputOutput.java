package bai36;

import java.time.LocalDate;
import java.util.Scanner;

public class InputOutput {
    public static Student inputStudent() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        ValidateStudent validateStudent = new ValidateStudent();
        System.out.println("Nhập vào thông tin sinh viên ");
        System.out.println("Nhập vào tên:");
        String name = "";
        do {
            name = scanner.nextLine();
            if (!validateStudent.valid(name, validateStudent.NAME_REGEX)) {
                System.out.println("Sai định dạng!");
            }
        } while (!validateStudent.valid(name, validateStudent.NAME_REGEX));
        student.setName(name);
        System.out.println("Nhập vào ngày sinh: ");
        int day = scanner.nextInt();
        System.out.println("Nhập vào tháng sinh: ");
        int month = scanner.nextInt();
        System.out.println("Nhập vào năm sinh: ");
        int year = scanner.nextInt();
        student.setDateOfBirth(LocalDate.of(year, month, day));
        return student;
    }

    public static void outputStudent(Student student) {
        System.out.println("Tên: " + student.getName() + ", tuổi: " + student.getAge());
    }
}
