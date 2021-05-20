package b175.bai2;

public class TaiLieu {
    private int ma;
    private String nxb;
    private String ten;
    private int soBanPhatHanh;

    public TaiLieu(String ten, String nxb, int soBanPhatHanh) {

        this.ten = ten;
        this.nxb = nxb;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public TaiLieu() {
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "ma=" + ma +
                ", nxb='" + nxb + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
