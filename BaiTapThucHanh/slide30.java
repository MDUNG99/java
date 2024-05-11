import java.util.Scanner;

public class slide30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, s;
        System.out.print("Nhap 1 so nguyen duong: ");
        n = sc.nextInt();
        s = 0;
        while (n > 0) {
            s = s + n % 10;
            n = n / 10;
        }
        System.out.println("Tong cac chu so la: " + s);
    }
}