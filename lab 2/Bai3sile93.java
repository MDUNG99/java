import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Bai3sile93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập năm sinh của bạn: ");
        int namSinh = scanner.nextInt();
        int tuoi = tinhTuoi(namSinh);
        hienThiNhomTuoi(ten, tuoi);
        scanner.close();
    }
    private static int tinhTuoi(int namSinh) {
        int namHienTai = LocalDate.now().getYear();
        return namHienTai - namSinh;
    }
    private static void hienThiNhomTuoi(String ten, int tuoi) {
        if (tuoi < 16) {
            System.out.println("Bạn " + ten + " ở độ tuổi vị thành niên.");
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println("Bạn " + ten + " ở độ tuổi trưởng thành.");
        } else {
            System.out.println("Bạn " + ten + " đã già.");
        }
    }
}
