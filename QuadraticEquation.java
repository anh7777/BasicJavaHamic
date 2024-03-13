package Hamic.BasicJava.week1;

public class QuadraticEquation {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Entered incorrect syntax.");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Invalid");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("The double solution of the equation is: " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The solutions of the equation are: " + x1 + " and " + x2);
        }
    }
}
