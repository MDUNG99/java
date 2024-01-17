import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int so = scanner.nextInt();
        if (so % 2 == 0) {
            System.out.println(so + " là số chẵn.");
        } else {
            System.out.println(so + " là số lẻ.");
        }
        scanner.close();
    }
}
