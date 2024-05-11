package Kethua;

import java.util.Scanner;

public class hinhtrutron extends HinhTron{
    public float chieucao;
    public void nhapChieuCao () {
        nhapBanKinh();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu cao hinh tru tron : ");
        chieucao = sc.nextFloat();
     }
     public void tinhTheTich () {
        theTich = PI * banKinh * banKinh * chieucao;
      }
}