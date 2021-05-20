package b175.bai2;

public class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao(String ten, String nxb, int soBanPhatHanh, String ngayPhatHanh) {
        super(ten, nxb, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao() {
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return super.toString() + "Bao{" +
                "ngayPhatHanh='" + ngayPhatHanh + '\'' +
                '}';
    }
}
