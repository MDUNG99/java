import java.util.Scanner;

public class bai_12 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int m,n;
        do {
            System.out.print("Nhap vao so hang cua ma tran: ");
            m = sc.nextInt();

        } while (m<0);
        do {
            System.out.print("Nhap vao so cot cua ma tran: ");
            n=sc.nextInt();
        } while (n<0);
        int a[][]=new int[m][n];
        System.out.println("Nhap cac phan tu cho ma tran");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A["+i+"]["+j+"]= ");
                a[i][j]=sc.nextInt();
            }
        }
        int max = a[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < a[i][j])
                max = a[i][j];
            }
        }
    System.out.println("Phan tu co gia tri lon nhat trong ma tran la: "+max);
    }
}