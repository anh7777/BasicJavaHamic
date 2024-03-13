package Hamic.BasicJava.week1;

import java.util.Scanner;

public class ReverseConcatenation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter string a: ");
            String a = scanner.nextLine();

            System.out.print("Enter string b: ");
            String b = scanner.nextLine();

            String reverseConcatenation = b + a;

            System.out.println("The string created from a and b in reverse order is: " + reverseConcatenation);
        }
    }
}
