package kethua;

import java.util.Scanner;

public class hinhchunhat extends Hinh_Hoc {
    public float dai;
    public float rong;
    public void nhapChieuDai () {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu dai : ");
        dai = sc.nextFloat();
    }
    public void nhapChieuRong () {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu rong : ");
        rong = sc.nextFloat();
    }
    public void tinhChuVi () {
        chuVi = (dai + rong) * 2;
    }
    public void tinhDienTich () {
        dienTich = dai *rong;
    }
}