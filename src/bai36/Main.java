package bai36;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ManagementStudent managementStudent = new ManagementStudent();
        ValidateStudent validateStudent = new ValidateStudent();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("======Menu=====");
            System.out.println("1: Thêm học sinh");
            System.out.println("2: Hiển thị");
            System.out.println("3: Tìm kiếm thông tin người");
            System.out.println("4: Xóa thông tin người theo id");
            System.out.println("5: Sửa thông tin người theo id");
            System.out.println("6: Sắp xếp học sinh");
            System.out.println("7: Ghi vào file");
            System.out.println("8: Đọc từ file");
            System.out.println("9: exit");
            int choice = -1;
            while (choice == -1) {
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Nhập vào số đi :))))))");
                } finally {
                    scanner.nextLine();
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào thông tin học sinh:");
                    System.out.println("Nhập vào id: ");
                    String id = "";
                    do {
                        id = scanner.nextLine();
                        if (validateStudent.valid(id, validateStudent.ID_REGEX) == false) {
                            System.out.println("Sai định dạng :))))");
                        }
                    } while (!validateStudent.valid(id, validateStudent.ID_REGEX));
                    if (managementStudent.checkExistedId(id)) {
                        Student student = InputOutput.inputStudent();
                        student.setId(id);
                        managementStudent.add(student);
                    } else {
                        System.out.println("Id trùng :))))");
                    }
                    break;
                case 2:
                    for (int i = 0; i < managementStudent.getAll().size(); i++) {
                        InputOutput.outputStudent(managementStudent.getAll().get(i));
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào id cần tìm: ");
                    String idFind = scanner.nextLine();
                    int pos = managementStudent.findById(idFind);
                    if (pos == -1) {
                        System.out.println("Không có!");
                    } else {
                        InputOutput.outputStudent(managementStudent.getAll().get(pos));
                    }
                    break;
                case 5:
                    System.out.println("Nhập vào id cần sửa:");
                    String idEdit = scanner.nextLine();
                    boolean isNotExisted = managementStudent.checkExistedId(idEdit);
                    if (isNotExisted) {
                        System.out.println("id này không có trong danh sách!");
                    } else {
                        Student student = InputOutput.inputStudent();
                        student.setId(idEdit);
                        managementStudent.edit(student
                        );
                    }
                    break;
                case 4:
                    System.out.println("Nhập vào id cần xoá:");
                    String idDel = scanner.nextLine();
                    isNotExisted = managementStudent.checkExistedId(idDel);
                    if (isNotExisted) {
                        System.out.println("id này không có trong danh sách!");
                    } else {
                        System.out.println("Bạn có muốn xoá không (Nhập Y đề đồng ý :))))");
                        String acc = scanner.nextLine();
                        if (acc.equals("Y")) {
                            managementStudent.delete(idDel);
                            System.out.println("Xoá thành công!");
                        }
                    }
                    break;
                case 6:
                    managementStudent.sort();
                    break;
                case 7:
                    managementStudent.writeToFile();
                    break;
                case 8:
                     managementStudent.readFromFile();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
