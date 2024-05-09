public class TongCacSoChan {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = sumOfEvenNumbers(numbers);
        System.out.println("Tổng các số chẵn trong mảng là: " + sum);
    }
    public static int sumOfEvenNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}
