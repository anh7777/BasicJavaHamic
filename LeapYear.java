package Hamic.BasicJava.week1;

public class LeapYear {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Entered incorrect syntax.");
            return;
        }

        int year = Integer.parseInt(args[0]);

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
