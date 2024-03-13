package Hamic.BasicJava.week1;

public class CheckNumber {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Entered incorrect syntax.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n > 0) {
            System.out.println("true");
        } else if (n < 0) {
            System.out.println("false");
        } else {
            System.out.println("Entered incorrect syntax.");
        }
    }
}
