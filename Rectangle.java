package Hamic.BasicJava.week1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the length: ");
            double length = scanner.nextDouble();

            System.out.print("Enter the width: ");
            double width = scanner.nextDouble();

            double perimeter = 2 * (length + width);
            double area = length * width;

            System.out.println("Perimeter of the rectangle " + perimeter);
            System.out.println("Area of the rectangle: " + area);
        }
    }
}
