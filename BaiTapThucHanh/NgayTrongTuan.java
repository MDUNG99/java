import java.util.Scanner;

public class NgayTrongTuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số ngày (từ 1 đến 7): ");
        int soNgay = scanner.nextInt();
        if (soNgay >= 1 && soNgay <= 7) {
            switch (soNgay) {
                case 1:
                    System.out.println("Ngày thứ 2 trong tuần");
                    break;
                case 2:
                    System.out.println("Ngày thứ 3 trong tuần");
                    break;
                case 3:
                    System.out.println("Ngày thứ 4 trong tuần");
                    break;
                case 4:
                    System.out.println("Ngày thứ 5 trong tuần");
                    break;
                case 5:
                    System.out.println("Ngày thứ 6 trong tuần");
                    break;
                case 6:
                    System.out.println("Ngày thứ 7 trong tuần");
                    break;
                case 7:
                    System.out.println("Ngày Chủ nhật trong tuần");
                    break;
            }
        } else {
            System.out.println("Số ngày không hợp lệ. Vui lòng nhập lại từ 1 đến 7.");
        }
        scanner.close();
    }
}
