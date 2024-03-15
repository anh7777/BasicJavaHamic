import java.util.Arrays;
import java.util.Scanner;

public class LargestDecreasingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        String input = scanner.next();
        char[] digits = input.toCharArray();
        Arrays.sort(digits);
        System.out.println("Số lớn nhất tạo nên từ các chữ số của " + input + " là: " + largestDecreasingNumber(digits));
    }

    public static String largestDecreasingNumber(char[] digits) {
        char[] result = new char[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {
            result[digits.length - 1 - i] = digits[i];
        }
        return new String(result);
    }
}
