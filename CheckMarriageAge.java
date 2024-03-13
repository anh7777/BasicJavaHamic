package Hamic.BasicJava.week1;

public class CheckMarriageAge {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Entered incorrect syntax.");
            return;
        }

        int age = Integer.parseInt(args[0]);

        if (age >= 18) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
