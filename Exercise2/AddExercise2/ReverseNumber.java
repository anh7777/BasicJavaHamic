import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        System.out.println("Số đảo ngược của " + n + " là: " + reverseNumber(n));
    }

    public static int reverseNumber(int n) {
        return reverseNumber(n, 0);
    }

    public static int reverseNumber(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        return reverseNumber(n / 10, reversed * 10 + n % 10);
    }
}
