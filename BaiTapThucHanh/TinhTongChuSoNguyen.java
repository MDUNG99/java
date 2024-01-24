import java.util.Scanner;

public class TinhTongChuSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter the numbers (type 0 to stop):");

        do {
            number = scanner.nextInt();
            sum += number;
            if (sum > 100) {
                System.out.println("The sum of the numbers is greater than 100.");
                break;
            }
        } while (number != 0);

        System.out.println("The sum of the numbers is: " + sum);
    }
}