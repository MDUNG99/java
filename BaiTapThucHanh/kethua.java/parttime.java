package KeThua_Person;

import java.util.Scanner;

public class parttime extends Employer {
    public int hour;
    final float soTien1Gio = 50000f;

    public void nhapSoGioDiLam() {
        Scanner sc = new Scanner(System.in);
        super.nhapGiaTriEmployer();
        do {
            System.out.print("nhap so gio di lam");
            hour = sc.nextInt();
        } while (hour < 0 || hour > 24);
    }

    public void tinhLuongGioLam() {
        luong = hour * soTien1Gio * ngayDiLam;
    }

    public void intinhLuongPartTime() {
        super.inGiaTriEmployer();
        System.out.print("luong nhan vien part time : " + luong);
    }
}