import java.util.Scanner;

public class SumOfRealNumbers {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter number of array elements: ");
         int n = scanner.nextInt();
         double[] arr = new double[n];
         System.out.println("Enter array elements:");
         for (int i = 0; i < n; i++) {
             arr[i] = scanner.nextDouble();
         }
         System.out.println("The sum of the elements in the array is: " + findSum(arr));
     }

     public static double findSum(double[] arr) {
         double sum = 0;
         for (double num : arr) {
             sum += num;
         }
         return sum;
     }
}
