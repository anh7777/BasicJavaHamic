package Hamic.BasicJava.week1;

public class LinearSystem {
    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Incorrect syntax.");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);
        double e = Double.parseDouble(args[4]);
        double f = Double.parseDouble(args[5]);

        double D = a * e - b * d;
        double Dx = c * e - b * f;
        double Dy = a * f - c * d;

        if (D == 0) {
            if (Dx == 0 && Dy == 0) {
                System.out.println("Infinitely many solutions");
            } else {
                System.out.println("Invalid");
            }
        } else {
            double x = Dx / D;
            double y = Dy / D;
            System.out.println("The solution of the system of equations is: x = " + x + ", y = " + y);
        }
    }
}
