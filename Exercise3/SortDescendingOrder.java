import java.util.Arrays;
import java.util.Scanner;

public class SortDescendingOrder {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter number of array elements: ");
         int n = scanner.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter array elements:");
         for (int i = 0; i < n; i++) {
             arr[i] = scanner.nextInt();
         }
         Arrays.sort(arr);
         System.out.println("Array after sorting in descending order:");
         for (int i = n - 1; i >= 0; i--) {
             System.out.print(arr[i] + " ");
         }
         System.out.println();
     }
}
