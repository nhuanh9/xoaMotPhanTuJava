package b175.bai2;

public class Main {
    public static void main(String[] args) {
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();
        Sach sach = new Sach("KĐ", 1000, "VC", 150);
        quanLyTaiLieu.themMoi(sach);
        Sach sachThuNhat = new Sach("KĐ", 1000, "VC", 150);
        quanLyTaiLieu.themMoi(sachThuNhat);
        Sach sachThuHai = new Sach("KĐ1", 1000, "VC", 150);
        quanLyTaiLieu.themMoi(sachThuHai);
        quanLyTaiLieu.hienThi();
    }


}
