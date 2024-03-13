package Hamic.BasicJava.week1;

import java.text.DecimalFormat;
public class TrigonometricCalculations {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.###");

        double resultA = Math.pow(Math.sin(Math.PI / 16), 2) + Math.pow(Math.cos(Math.PI / 16), 2);
        System.out.println("a) sin^2(π/16) + cos^2(π/16) = " + df.format(resultA));

        double resultB = Math.sin(Math.PI / 3) - Math.cos(Math.PI / 4);
        System.out.println("b) sin(π/3) - cos(π/4) = " + df.format(resultB));

        double resultC = 2.0/3 + 17.0/18;
        System.out.println("c) 2/3 + 17/18 = " + df.format(resultC));

        double resultD = Math.exp(3.0/2) + Math.sin(Math.PI/2);
        System.out.println("d) e^(3/2) + sin(π/2) = " + df.format(resultD));

        double resultE = Math.log(62) / Math.log(5) + Math.tan(Math.PI);
        System.out.println("e) log5(62) + tan(π) = " + df.format(resultE));
    }
}
