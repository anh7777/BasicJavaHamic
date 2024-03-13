package Hamic.BasicJava.week1;

import java.util.Scanner;

public class CharDistance {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first character: ");
            char char1 = scanner.next().charAt(0);

            System.out.print("Enter the second character: ");
            char char2 = scanner.next().charAt(0);

            int distance = Math.abs(char2 - char1);

            System.out.println("Distance between " + char1 + " and " + char2 + " in the alphabet is: " + distance);
        }
    }
}
