import java.util.Scanner;

public class bai_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so luong phan tu cua mang: ");
        n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Nhap gia tri cho mang");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = sc.nextInt();
        }
        System.out.print("Mang so ban dau: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] > A[j]) {
                    int dao = A[i];
                    A[i] = A[j];
                    A[j] = dao;
                }
            }
        }
        System.out.print("Mang da sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}