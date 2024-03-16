import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortNames {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter number of names: ");
         int n = scanner.nextInt();
         scanner.nextLine();
         String[] names = new String[n];
         System.out.println("Enter names:");
         for (int i = 0; i < n; i++) {
             names[i] = scanner.nextLine();
         }
         Arrays.sort(names, Comparator.comparing(String::toLowerCase));
         System.out.println("Array of names after sorting in ascending and normalizing order:");
         for (String name : names) {
             System.out.println(normalizeName(name));
         }
     }

     public static String normalizeName(String name) {
         String[] parts = name.split("\\s+");
         StringBuilder normalized = new StringBuilder();
         for (String part : parts) {
             if (!part.isEmpty()) {
                 normalized.append(Character.toUpperCase(part.charAt(0)))
                         .append(part.substring(1).toLowerCase())
                         .append(" ");
             }
         }
         return normalized.toString().trim();
     }
}
