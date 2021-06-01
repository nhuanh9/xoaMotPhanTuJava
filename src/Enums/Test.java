package Enums;

public class Test {
    public static void main(String[] args) {

        for (Status v: Status.values()) {
            System.out.println(v);
            v.getText();
        }
    }
}
