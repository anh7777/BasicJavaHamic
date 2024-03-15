import java.util.Scanner;

public class SeriesNthNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        System.out.println("Số thứ " + n + " của dãy là: " + nthNumber(n));
    }

    public static double nthNumber(int n) {
        if (n == 1) {
            return 1;
        }
        return nthNumber(n - 1) + Math.sqrt(n);
    }
}
