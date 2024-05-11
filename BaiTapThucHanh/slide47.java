import java.util.Scanner;

public class slide47 {
    public static void main(String[] args) {
        int n, s = 0;
        String Str = "";
        Scanner sc = new Scanner(System.in);
        while (s <= 100) {
            System.out.print("Nhap vao so nguyen bat ky: ");
            n = sc.nextInt();
            s = s + n;
            Str = Str + n + " + ";
        }
        System.out.println(Str.substring(0, Str.length() - 2) + "= " + s);
    }
}