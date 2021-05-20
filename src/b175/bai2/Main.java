package b175.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();
        Sach sach = new Sach("1", "KĐ", 1000, "VC", 150);
        quanLyTaiLieu.themMoi(sach);
        Sach sachThuNhat = new Sach("2", "KĐ", 1000, "VC", 150);
        quanLyTaiLieu.themMoi(sachThuNhat);
        Sach sachThuHai = new Sach("3", "KĐ1", 1000, "VC", 150);
        quanLyTaiLieu.themMoi(sachThuHai);
        TapChi tapChi = new TapChi("312312", "KĐ3123121", 1000, 123, 10);
        quanLyTaiLieu.themMoi(tapChi);
        quanLyTaiLieu.hienThi();
        System.out.println("----------------");
        quanLyTaiLieu.hienThiDanhSachTheoLoai("TapChi");
    }


}
