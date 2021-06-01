package bttonghop;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1: Thêm Học sinh");
            System.out.println("2: Hiển thị danh sách Học sinh");
            System.out.println("3: Xóa học sinh theo  id");
            System.out.println("4: Tìm Kiếm học sinh theo  id");
            System.out.println("5: Sắp xếp học sinh theo tên");
            System.out.println("6:  Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("nhập key");
                    int key = sc.nextInt();
                    System.out.println("Nhập tên");
                    String name = sc.next();
                    System.out.println("Nhập tuổi");
                    int age = sc.nextInt();
                    System.out.println("Nhập địa chỉ");
                    String address = sc.next();
                    System.out.println("Nhập giới tính");
                    int gender = sc.nextInt();
                    System.out.println("Nhập trường");
                    String school = sc.next();
                    manager.add(key, new Student(name,age,address,gender,school));
                    break;
                }
                case 2:
                    System.out.println("Danh sách của bạn là");
                    manager.display();
                    break;
                case 3:
                    System.out.println("Nhập id bạn muốn xóa");
                    int a = sc.nextInt();
                    if (manager.check(a)) {
                        manager.delete(a);
                        manager.display();
                    } else System.out.println("không có id đúng để xóa");
                    break;
                case 4:
                    System.out.println("Nhập id bạn muốn tìm kiếm ");
                    int b = sc.nextInt();
                    manager.searh(b);
                    break;
                case 5:
                    System.out.println("Danh sách của bạn sau khi sắp xếp theo tên là : ");
                    manager.sort();
                    manager.display();
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
                    break;
            }
        }
    }
}

