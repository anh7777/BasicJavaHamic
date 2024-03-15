import java.util.Arrays;
import java.util.Scanner;

public class NthSmallestInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập số n: ");
        int k = scanner.nextInt();
        Arrays.sort(arr);
        if (k <= arr.length) {
            System.out.println("Số nhỏ thứ " + k + " trong mảng là: " + arr[k - 1]);
        } else {
            System.out.println("Không có số nhỏ thứ " + k + " trong mảng.");
        }
    }
}
