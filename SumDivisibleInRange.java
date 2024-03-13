package Hamic.BasicJava.week1;

import java.util.Scanner;

public class SumDivisibleInRange {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the lower limit l: ");
            int l = scanner.nextInt();

            System.out.print("Enter the upper limit r: ");
            int r = scanner.nextInt();

            System.out.print("Enter the integer t: ");
            int t = scanner.nextInt();

            int sum = 0;
            for (int i = l; i <= r; i++) {
                if (i % t == 0) {
                    sum += i;
                }
            }

            System.out.println("The sum of integers is divisible by " + t + " in paragraph [" + l + ", " + r + "] is: " + sum);
        }
    }
}
