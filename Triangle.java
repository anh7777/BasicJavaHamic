package Hamic.BasicJava.week1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the measure of an angle (in degrees): ");
            double angle = scanner.nextDouble();

            System.out.print("Enter the length of the first adjacent side: ");
            double side1 = scanner.nextDouble();

            System.out.print("Enter the length of the second adjacent side: ");
            double side2 = scanner.nextDouble();

            double area = 0.5 * side1 * side2 * Math.sin(Math.toRadians(angle));

            System.out.println("The area of the triangle is: " + area);
        }
    }
}
