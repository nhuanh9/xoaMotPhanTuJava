package Enums;

public enum Status {
    SPRING(5), SUMMER(10), FALL(15), WINTER(20);

    private int hi;

    Status(int value) {
        this.hi = value;
    }

    public void getText() {
        System.out.println(hi);
    }
}
