import java.util.Arrays;
import java.util.Scanner;

public class NthSmallestInteger {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter number of array elements: ");
         int n = scanner.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter array elements:");
         for (int i = 0; i < n; i++) {
             arr[i] = scanner.nextInt();
         }
         System.out.print("Enter number n: ");
         int k = scanner.nextInt();
         Arrays.sort(arr);
         if (k <= arr.length) {
             System.out.println("The smallest number " + k + " in the array is: " + arr[k - 1]);
         } else {
             System.out.println("There is no small number " + k + " in the array.");
         }
     }
}
