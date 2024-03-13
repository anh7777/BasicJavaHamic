package Hamic.BasicJava.week1;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the coordinates of the point A (x, y, z): ");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double z1 = scanner.nextDouble();

            System.out.print("Enter the coordinates of the point B (a, b, c): ");
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double z2 = scanner.nextDouble();

            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));

            System.out.println("The distance between two points is: " + distance);
        }
    }
}
