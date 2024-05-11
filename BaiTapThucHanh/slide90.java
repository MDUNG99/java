import java.util.Scanner;

public class slide90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        char kytu;
        System.out.print("Nhap vao 1 chuoi bat ky: ");
        str = sc.nextLine();
        System.out.println("Cac ky tu co trong chuoi la: ");
        for (int i = 0; i < str.length(); i++) {
            kytu = str.charAt(i);
            System.out.println(kytu);
        }
    }
}
