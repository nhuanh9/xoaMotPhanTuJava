package QLX;

public class Oto extends PhuongTien {
    private int soCho;

    public Oto() {
    }

    public Oto(String hang, String mau, String ten, int gia, int soCho) {
        super(hang, mau, ten, gia);
        this.soCho = soCho;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }
}
