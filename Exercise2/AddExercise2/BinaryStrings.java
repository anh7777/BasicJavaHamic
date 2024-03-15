import java.util.Scanner;

public class BinaryStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = scanner.nextInt();
        generateBinaryStrings(n, "");
    }

    public static void generateBinaryStrings(int n, String s) {
        if (n == 0) {
            System.out.println(s);
        } else {
            generateBinaryStrings(n - 1, s + "0");
            generateBinaryStrings(n - 1, s + "1");
        }
    }
}
