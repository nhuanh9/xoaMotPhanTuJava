package b175.bai2;

public class QuanLyTaiLieu {
    private int maHienTai = 0;
    private TaiLieu[] danhSachTaiLieu;
    private int soLuong;

    public QuanLyTaiLieu() {
        this.danhSachTaiLieu = new TaiLieu[100];
        this.soLuong = 0;
    }

    public int themMoi(TaiLieu taiLieu) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSachTaiLieu[i].getNxb().equals(taiLieu.getNxb())) {
                danhSachTaiLieu[i].setSoBanPhatHanh(danhSachTaiLieu[i].getSoBanPhatHanh() + taiLieu.getSoBanPhatHanh());
                return 0;
            }
        }
        taiLieu.setMa(maHienTai);
        maHienTai++;
        danhSachTaiLieu[soLuong] = taiLieu;
        soLuong++;
        return 1;
    }

    public void hienThiDanhSachTheoLoai(String loai) {
        if (loai.equals("Sach")) {
            for (int i = 0; i < soLuong; i++) {
                if (danhSachTaiLieu[i] instanceof Sach) {
                    System.out.println(danhSachTaiLieu[i]);
                }
            }
        }
        if (loai.equals("TapChi")) {
            for (int i = 0; i < soLuong; i++) {
                if (danhSachTaiLieu[i] instanceof TapChi) {
                    System.out.println(danhSachTaiLieu[i]);
                }
            }
        }
    }

    public void hienThi() {
        for (int i = 0; i < soLuong; i++) {
            System.out.println(danhSachTaiLieu[i]);
        }
    }
}
