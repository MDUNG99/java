import java.util.Scanner;

public class Bai4sile94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên từ 1 đến 12: ");
        int soThang = scanner.nextInt();
        if (soThang >= 1 && soThang <= 12) {
            hienThiThang(soThang);
        } else {
            System.out.println("Số không hợp lệ. Vui lòng nhập số từ 1 đến 12.");
        }
        scanner.close();
    }
    private static void hienThiThang(int soThang) {
        switch (soThang) {
            case 1:
                System.out.println("Tháng 1");
                break;
            case 2:
                System.out.println("Tháng 2");
                break;
            case 3:
                System.out.println("Tháng 3");
                break;
            case 4:
                System.out.println("Tháng 4");
                break;
            case 5:
                System.out.println("Tháng 5");
                break;
            case 6:
                System.out.println("Tháng 6");
                break;
            case 7:
                System.out.println("Tháng 7");
                break;
            case 8:
                System.out.println("Tháng 8");
                break;
            case 9:
                System.out.println("Tháng 9");
                break;
            case 10:
                System.out.println("Tháng 10");
                break;
            case 11:
                System.out.println("Tháng 11");
                break;
            case 12:
                System.out.println("Tháng 12");
                break;
        }
    }
}
