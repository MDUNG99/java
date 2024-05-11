package hinhhoc;

import java.util.Scanner;

public class hinhtron {
    public float BanKinh;
    public final float Pi = 3.14f;
    public float chu_vi;
    public float dien_tich;
    Scanner sc = new Scanner(System.in);

    public void nhap_bankinh() {
        System.out.print("nhap ban kinh hinh tron=");
        BanKinh = sc.nextFloat();
    }

    public void Tinh_chu_vi() {
        chu_vi = Pi * 2 * BanKinh;
    }

    public void Tinh_dien_tich() {
        dien_tich = Pi * BanKinh * BanKinh;
    }

    public void In_cv_dt_hinh_tron() {
        System.out.println("co mot Hinh Tron <3");
        System.out.println("ban kinh hinh tron R=" + BanKinh);
        System.out.println("chu vi hinh tron C=" + chu_vi);
        System.out.println("dien tich hinh tron S=" + dien_tich);
    }
}
