package Hamic.BasicJava.week1;

public class LinearEquation {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Entered incorrect syntax.");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        if (a == 0) {
            if (b == 0) {
                System.out.println("Wealth of counter");
            } else {
                System.out.println("No solution");
            }
        } else {
            double x = -b / a;
            System.out.println("The solution of the equation is: " + x);
        }
    }
}
