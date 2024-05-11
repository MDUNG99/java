package kethua_Person;

import java.util.Scanner;

public class Employer extends Person{
    public String maNhanVien;
    public String chucVu;
    public int ngayDiLam;
    public float luong;
    final float tienluong = 300000f;
    public void nhapGiaTriEmployer () {
        Scanner sc = new Scanner(System.in);
        super.nhapGiaTri();
        System.out.print("nhap ma nhan vien : ");
        maNhanVien = sc.nextLine();
        System.out.print("nhap chuc vu : ");
        chucVu = sc.nextLine();
        do {
            System.out.print("nhap so ngay di lam : ");
            ngayDiLam = sc.nextInt();
        }while (ngayDiLam < 1 || ngayDiLam > 31);
    }
    public void inGiaTriEmployer () {
        super.inGiaTri();
        System.out.println("nhan vien : " + maNhanVien);
        System.out.println(" chuc vu : " + chucVu);
    }
}