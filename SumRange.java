package Hamic.BasicJava.week1;

import java.util.Scanner;

public class SumRange {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter integer a: ");
            int a = scanner.nextInt();

            System.out.print("Enter integer b: ");
            int b = scanner.nextInt();

            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += i;
            }

            System.out.println("Sum of integers in the segment [" + a + ", " + b + "] is: " + sum);
        }
    }
}
