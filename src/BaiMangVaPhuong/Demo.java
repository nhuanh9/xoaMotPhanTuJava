package BaiMangVaPhuong;

import java.util.Date;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int daySo[] = {1, 5, 2, 3, 8};
        Scanner scanner = new Scanner(System.in);
        int soCanXoa = scanner.nextInt();
        int viTriCanXoa = timViTriPhanTu(daySo, soCanXoa);
        if (viTriCanXoa == -1) {
            System.out.println("Phần tử không ở trong mảng!");
        } else {
            daySo = xoaMotPhanTu(daySo, viTriCanXoa);
        }
        for (int i = 0; i < daySo.length; i++) {
            System.out.print(daySo[i] + " ");
        }
    }

    static int timViTriPhanTu(int[] daySo, int phanTu) {
        int viTri = -1;
        for (int i = 0; i < daySo.length; i++) {
            if (daySo[i] == phanTu) {
                viTri = i;
            }
        }
        return viTri;
    }

    static int[] xoaMotPhanTu(int[] daySo, int viTri) {
        int[] daySoMoi = new int[daySo.length - 1];
        for (int i = 0; i < viTri; i++) {
            daySoMoi[i] = daySo[i];
        }
        for (int i = viTri + 1; i < daySo.length; i++) {
            daySoMoi[i-1] = daySo[i];
        }
        return daySoMoi;
    }
}
