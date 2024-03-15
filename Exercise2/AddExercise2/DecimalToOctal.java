import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        System.out.print("Số " + n + " trong hệ bát phân là: ");
        convertToOctal(n);
    }

    public static void convertToOctal(int n) {
        if (n == 0) {
            return;
        }
        convertToOctal(n / 8);
        System.out.print(n % 8);
    }
}
