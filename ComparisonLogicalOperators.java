package Hamic.BasicJava.week1;

public class ComparisonLogicalOperators {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        boolean resultA = 2 > 1;
        System.out.println("a) 2 > 1: " + resultA);

        boolean resultB = 3 <= 2 && 10 > 5;
        System.out.println("b) 3 <= 2 && 10 > 5: " + resultB);

        boolean resultC = 7 < 8 || 1000 < 1;
        System.out.println("c) 7 < 8 || 1000 < 1: " + resultC);


        boolean resultD = 6 < 7 && 10 > 5 || false && 4 < 3;
        System.out.println("d) 6 < 7 && 10 > 5 || false && 4 < 3: " + resultD);

        boolean resultE = (!(10 <= 9) || !(true && (10 > 3))) && (1 <= -5 && (!(10 > 11) || true));
        System.out.println("e) (!(10 <= 9) || !(true && (10 > 3))) && (1 <= -5 && (!(10 > 11) || true)): " + resultE);
    }
}
