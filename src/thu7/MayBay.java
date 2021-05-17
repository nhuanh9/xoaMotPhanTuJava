package thu7;

public class MayBay implements CoTheBay {
    private String loai;
    private int soGhe;

    public MayBay(String loai, int soGhe) {
        this.loai = loai;
        this.soGhe = soGhe;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    @Override
    public void bay() {

    }
}
