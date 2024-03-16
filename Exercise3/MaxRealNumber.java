import java.util.Scanner;

public class MaxRealNumber {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter number of array elements: ");
         int n = scanner.nextInt();
         double[] arr = new double[n];
         System.out.println("Enter array elements:");
         for (int i = 0; i < n; i++) {
             arr[i] = scanner.nextDouble();
         }
         System.out.println("The largest number in the array is: " + findMax(arr));
     }

     public static double findMax(double[] arr) {
         double max = arr[0];
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] > max) {
                 max = arr[i];
             }
         }
         return max;
     }
}
