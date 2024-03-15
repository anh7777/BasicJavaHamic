import java.util.Scanner;

public class TrapezoidalRule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giới hạn dưới a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giới hạn trên b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập số phần tử n: ");
        int n = scanner.nextInt();
        System.out.println("Giá trị gần đúng của ln(x) = " + trapezoidalRule(a, b, n));
    }

    public static double trapezoidalRule(double a, double b, int n) {
        double h = (b - a) / n;
        double sum = 0.5 * (function(a) + function(b));
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            sum += function(x);
        }
        return sum * h;
    }

    public static double function(double x) {
        return Math.sqrt(x * x + 1);
    }
}
