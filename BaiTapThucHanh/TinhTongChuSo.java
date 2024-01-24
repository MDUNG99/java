import java.util.Scanner;

public class TinhTongChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên (n > 0): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên lớn hơn 0.");
        } else {
            int tongChuSo = tinhTongChuSo(n);
            System.out.println("Tổng các chữ số của số " + n + " là: " + tongChuSo);
        }
        scanner.close();
    }
    private static int tinhTongChuSo(int number) {
        int tong = 0;
        while (number != 0) {
            tong += number % 10;
            number /= 10;
        }
        return tong;
    }
}
