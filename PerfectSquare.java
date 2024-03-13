package Hamic.BasicJava.week1;

public class PerfectSquare {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Incorrect syntax.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        int sqrt = (int) Math.sqrt(n);

        if (sqrt * sqrt == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
