import java.util.Scanner;

public class IsStrictlyIncreasing {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter number of array elements: ");
         int n = scanner.nextInt();
         double[] arr = new double[n];
         System.out.println("Enter array elements:");
         for (int i = 0; i < n; i++) {
             arr[i] = scanner.nextDouble();
         }
         System.out.println("Array " + (isStrictlyIncreasing(arr) ? "is" : "is not") + " actually increasing sequence.");
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
