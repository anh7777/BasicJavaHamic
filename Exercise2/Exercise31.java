import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        
        //a) Kiểm tra xem số n có phải là số nguyên tố không?"
        System.out.println(isPrime(n));
        
        //b) Kiểm tra xem số n có phải là số hoàn hảo không?"
        System.out.println(isPerfectNumber(n));
        
        //c) In ra màn hình n số nguyên tố đầu tiên:"
        printFirstNPrimes(n);
        
        //d) In ra màn hình số Fibonacci thứ n:"
        System.out.println(getFibonacci(n));
        
        //f) Nhập số thực x, tính sin(x) theo công thức Taylor đến o(x^(2n+1)):
        System.out.println("Enter x:");
        double doubleX = scanner.nextDouble();
        System.out.println("Enter n:");
        int taylorDegree = scanner.nextInt();
        System.out.println("sin(" + doubleX + ") = " + calculateSin(doubleX, taylorDegree));
        
        //g) Nhập số thực x, tính e^x theo công thức Taylor đến o(x^n):"
        System.out.println("Enter x:");
        double xDouble = scanner.nextDouble();
        System.out.println("Enter n:");
        taylorDegree = scanner.nextInt();
        System.out.println("e^(" + xDouble + ") = " + calculateExponential(xDouble, taylorDegree));
        
        //h) Nhập số thực x, tính cos(x) theo công thức Taylor đến o(x^(2n))
        System.out.println("Enter x:");
        xDouble = scanner.nextDouble();
        System.out.println("Enter n:");
        taylorDegree = scanner.nextInt();
        System.out.println("cos(" + xDouble + ") = " + calculateCos(xDouble, taylorDegree));
        
        scanner.close();
    }
    
    // a) Kiểm tra số nguyên tố
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
    
    // b) Kiểm tra số hoàn hảo
    public static boolean isPerfectNumber(int number) {
        int sum = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                if (i * i != number) {
                    sum = sum + i + number / i;
                } else {
                    sum = sum + i;
                }
            }
        }
        return sum == number && number != 1;
    }
    
    // c) In ra n số nguyên tố đầu tiên
    public static void printFirstNPrimes(int n) {
        int count = 0;
        for (int i = 2; count < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
    }
    
    // d) Số Fibonacci thứ n
    public static int getFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1, prev = 1;
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }
    
    // f) Tính sin(x) theo công thức Taylor đến o(x^(2n+1))
    public static double calculateSin(double x, int n) {
        double result = 0;
        for (int i = 0; i <= n; i++) {
            result += Math.pow(-1, i) * (Math.pow(x, 2 * i + 1) / factorial(2 * i + 1));
        }
        return result;
    }
    
    // g) Tính e^x theo công thức Taylor đến o(x^n)
    public static double calculateExponential(double x, int n) {
        double result = 0;
        for (int i = 0; i <= n; i++) {
            result += Math.pow(x, i) / factorial(i);
        }
        return result;
    }
    
    // h) Tính cos(x) theo công thức Taylor đến o(x^(2n))
    public static double calculateCos(double x, int n) {
        double result = 0;
        for (int i = 0; i <= n; i++) {
            result += Math.pow(-1, i) * (Math.pow(x, 2 * i) / factorial(2 * i));
        }
        return result;
    }
    
    // Hàm tính giai thừa
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
