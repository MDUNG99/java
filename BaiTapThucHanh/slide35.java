import java.util.Scanner;

public class slide35 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        a = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        b = sc.nextInt();
        if (a > b)
            System.out.println("So nho nhat la " + b);
        else
            System.out.println("So nho nhat la " + a);
    }
}