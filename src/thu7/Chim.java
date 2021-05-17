package thu7;

public abstract class Chim {
    private String ten;
    private String noiO;

    public Chim(String ten, String noiO) {
        this.ten = ten;
        this.noiO = noiO;
    }

    public abstract void keu();

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNoiO() {
        return noiO;
    }

    public void setNoiO(String noiO) {
        this.noiO = noiO;
    }
}
