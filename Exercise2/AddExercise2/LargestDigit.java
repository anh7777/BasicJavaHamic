import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        System.out.println("Chữ số lớn nhất của " + n + " là: " + largestDigit(n));
    }

    public static int largestDigit(int n) {
        if (n < 10) {
            return n;
        }
        int max = largestDigit(n / 10);
        return Math.max(max, n % 10);
    }
}
