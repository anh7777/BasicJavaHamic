import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter positive number n: ");
        int n = scanner.nextInt();
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
