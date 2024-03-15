import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        System.out.println("Tổng " + n + " số đầu tiên là: " + sumOfFirstNNumbers(n));
    }

    public static int sumOfFirstNNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfFirstNNumbers(n - 1);
    }
}
