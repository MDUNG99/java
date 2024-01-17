import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double soThuNhat = scanner.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double soThuHai = scanner.nextDouble();
        double tong = soThuNhat + soThuHai;
        double hieu = soThuNhat - soThuHai;
        double tich = soThuNhat * soThuHai;
        double thuong = 0;
        double chiaDu = 0;
        if (soThuHai != 0) {
            thuong = soThuNhat / soThuHai;
            chiaDu = soThuNhat % soThuHai;
        } else {
            System.out.println("Lỗi: Số thứ hai không được là 0 khi thực hiện phép chia!");
        }
        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);
        if (soThuHai != 0) {
            System.out.println("Thương: " + thuong);
            System.out.println("Chia lấy dư: " + chiaDu);
        }
        if (soThuNhat > soThuHai) {
            System.out.println(soThuNhat + " lớn hơn " + soThuHai);
        } else if (soThuNhat < soThuHai) {
            System.out.println(soThuNhat + " nhỏ hơn " + soThuHai);
        } else {
            System.out.println("Hai số bằng nhau.");
        }
        scanner.close();
    }
}
