package demoQuanLy;

import java.util.Scanner;

public class DemoTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        int  b = sc.nextInt();
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            b = 1;
            System.out.println(a/b);
        }

    }
}
