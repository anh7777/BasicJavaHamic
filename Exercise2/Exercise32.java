import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a) In số đảo ngược của số nguyên n
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("The reverse number of " + n + " is " + reverseNumber(n));

        // b) Đếm số lượng số nguyên tố trong đoạn [l, r]
        System.out.println("Enter l and r (l < r):");
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println("The number between [" + l + "and " + r + "] is: " + countPrimesInRange(l, r));

        // c) Nhập số nguyên n từ 0 đến 100
        int input;
        do {
            System.out.println("Enter n from 0 to 100: ");
            input = scanner.nextInt();
        } while (input < 0 || input > 100);
        System.out.println("You entered " + input);

        // d) Kiểm tra số đẹp
        System.out.println("Enter n:");
        int number = scanner.nextInt();
        System.out.println("Is " + number + " is a nice number ? " + isBeautifulNumber(number));

        // e) In số lượng các số đẹp từ 1 đến n
        System.out.println("Enter n:");
        int limit = scanner.nextInt();
        System.out.println("the number of nice num from 1 to " + limit + " is: " + countBeautifulNumbers(limit));

        // f) In n số siêu lẻ đầu tiên
        System.out.println("Enter n:");
        int count = scanner.nextInt();
        printFirstNSuperOddNumbers(count);

        // g) Tính ln(1 + x) bằng khai triển Maclaurin
        System.out.println("Enter double x:");
        double x = scanner.nextDouble();
        System.out.println("ln(1 + " + x + ") = " + calculateNaturalLogarithm(x));

        scanner.close();
    }

    // a) In số đảo ngược của số nguyên n
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    // b) Đếm số lượng số nguyên tố trong đoạn [l, r]
    public static int countPrimesInRange(int l, int r) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // d) Kiểm tra số đẹp
    public static boolean isBeautifulNumber(int number) {
        int sumOfDigits = 0;
        int temp = number;
        while (temp != 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        return number % sumOfDigits == 0;
    }

    // e) Đếm số lượng các số đẹp từ 1 đến n
    public static int countBeautifulNumbers(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isBeautifulNumber(i)) {
                count++;
            }
        }
        return count;
    }

    // f) In n số siêu lẻ đầu tiên
    public static void printFirstNSuperOddNumbers(int n) {
        int count = 0;
        int num = 1;
        while (count < n) {
            if (isSuperOdd(num)) {
                System.out.print(num + " ");
                count++;
            }
            num += 2;
        }
        System.out.println();
    }

    // Hàm kiểm tra số siêu lẻ
    public static boolean isSuperOdd(int num) {
        if (num % 2 == 0) {
            return false;
        }
        int sumOfDigits = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                return false;
            }
            sumOfDigits += digit;
            temp /= 10;
        }
        return sumOfDigits % 2 != 0;
    }

    // g) Tính ln(1 + x) bằng khai triển Maclaurin
    public static double calculateNaturalLogarithm(double x) {
        double result = 0;
        double term = x;
        int n = 1;
        while (Math.abs(term) >= 1e-6) {
            result += term;
            term *= -x * (n + 1) / (n + 2);
            n++;
        }
        return result;
    }
}
