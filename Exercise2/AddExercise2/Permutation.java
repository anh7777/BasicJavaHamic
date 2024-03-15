import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập k: ");
        int k = scanner.nextInt();
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        System.out.println("A(" + k + ", " + n + ") = " + permutation(k, n));
    }

    public static int permutation(int k, int n) {
        if (k == 0) {
            return 1;
        }
        return n * permutation(k - 1, n - 1);
    }
}
