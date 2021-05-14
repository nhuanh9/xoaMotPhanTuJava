package QLX;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuanLyXeMay implements QuanLy<XeMay> {
    private XeMay[] danhSach = new XeMay[3];
    private int size = 0;

    @Override
    public void them(XeMay xeMay) {
        danhSach[size] = xeMay;
        size++;
    }

    @Override
    public void sua(String name, XeMay xeMay) {
        danhSach[timKiem(name)] = xeMay;
    }

    @Override
    public void xoa(String name) {

    }

    @Override
    public int timKiem(String name) {
        for (int i=0; i<size;i++) {
            if (name == danhSach[i].getTen()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sapXep() {
        Arrays.sort(danhSach);
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        QuanLyXeMay ql = new QuanLyXeMay();
        XeMay xm1 = new XeMay("Yamaha", "Xanh trắng", "R3", 120, 300);
        XeMay xm2 = new XeMay("Yamaha", "Đen đỏ", "R6", 220, 600);
        XeMay xm3 = new XeMay("Yamaha", "Đen", "R15", 70, 150);
        ql.them(xm1);
        ql.them(xm2);
        ql.them(xm3);
        ql.print();
        XeMay xm4 = new XeMay("Yamaha", "Xanh", "R1", 700, 1000);
        ql.sua("R3", xm4);
        ql.print();
        ql.sapXep();
        ql.print();
    }


}
