import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        if (isPalindrome(n)) {
            System.out.println(n + " là số đối xứng.");
        } else {
            System.out.println(n + " không phải là số đối xứng.");
        }
    }

    public static boolean isPalindrome(int n) {
        int reverse = reverseNumber(n);
        return n == reverse;
    }

    public static int reverseNumber(int n) {
        return reverseNumber(n, 0);
    }

    public static int reverseNumber(int n, int reverse) {
        if (n == 0) {
            return reverse;
        }
        return reverseNumber(n / 10, reverse * 10 + n % 10);
    }
}
