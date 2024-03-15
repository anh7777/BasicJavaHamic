import java.util.Scanner;

public class IsStrictlyIncreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        System.out.println("Mảng " + (isStrictlyIncreasing(arr) ? "là" : "không là") + " dãy tăng thực sự.");
    }

    public static boolean isStrictlyIncreasing(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
