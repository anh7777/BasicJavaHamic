import java.util.Arrays;
import java.util.Scanner;

public class Exercise41{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a) Nhập và in mảng các số nguyên
        System.out.println("Nhập số lượng phần tử trong mảng:");
        int n = scanner.nextInt();
        int[] integerArray = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            integerArray[i] = scanner.nextInt();
        }
        System.out.println("Mảng các số nguyên vừa nhập:");
        printIntArray(integerArray);

        // b) In ra số lớn nhất trong mảng các số thực
        System.out.println("Nhập số lượng phần tử trong mảng:");
        n = scanner.nextInt();
        double[] doubleArray = new double[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            doubleArray[i] = scanner.nextDouble();
        }
        System.out.println("Số lớn nhất trong mảng các số thực: " + findMax(doubleArray));

        // c) In ra tổng các phần tử trong mảng các số thực
        System.out.println("Tổng các phần tử trong mảng các số thực: " + calculateSum(doubleArray));

        // d) In ra số nhỏ thứ n trong mảng các số nguyên
        System.out.println("Nhập số nhỏ thứ n:");
        int smallN = scanner.nextInt();
        int nthSmallest = findNthSmallest(integerArray, smallN);
        if (nthSmallest == Integer.MAX_VALUE) {
            System.out.println("Không có số nhỏ thứ " + smallN + " trong mảng.");
        } else {
            System.out.println("Số nhỏ thứ " + smallN + " trong mảng là: " + nthSmallest);
        }

        // e) Kiểm tra xem mảng dãy số có phải là dãy tăng thực sự hay không
        System.out.println("Mảng là dãy tăng thực sự? " + isStrictlyIncreasing(doubleArray));

        // f) Sắp xếp mảng các số nguyên theo thứ tự giảm dần
        System.out.println("Mảng các số nguyên được sắp xếp giảm dần:");
        sortDescending(integerArray);
        printIntArray(integerArray);

        // g) Sắp xếp và chuẩn hóa mảng các tên
        System.out.println("Nhập số lượng tên:");
        int nameCount = scanner.nextInt();
        String[] names = new String[nameCount];
        scanner.nextLine(); // Clear buffer
        for (int i = 0; i < nameCount; i++) {
            System.out.println("Nhập tên thứ " + (i + 1) + ":");
            names[i] = scanner.nextLine();
        }
        sortAndNormalizeNames(names);
        System.out.println("Mảng tên sau khi sắp xếp và chuẩn hóa:");
        printStringArray(names);

        scanner.close();
    }

    // Hàm in mảng các số nguyên
    public static void printIntArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Hàm in mảng các số thực
    public static void printDoubleArray(double[] arr) {
        for (double num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Hàm tìm số lớn nhất trong mảng các số thực
    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Hàm tính tổng các phần tử trong mảng các số thực
    public static double calculateSum(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }

    // Hàm tìm số nhỏ thứ n trong mảng các số nguyên
    public static int findNthSmallest(int[] arr, int n) {
        if (n <= 0 || n > arr.length) {
            return Integer.MAX_VALUE;
        }
        Arrays.sort(arr);
        return arr[n - 1];
    }

    // Hàm kiểm tra xem mảng dãy số có phải là dãy tăng thực sự hay không
    public static boolean isStrictlyIncreasing(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Hàm sắp xếp mảng các số nguyên theo thứ tự giảm dần
    public static void sortDescending(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // Hàm in mảng các chuỗi
    public static void printStringArray(String[] arr) {
        for (String str : arr) {
            System.out.println(str);
        }
    }

    // Hàm sắp xếp và chuẩn hóa mảng các tên
    public static void sortAndNormalizeNames(String[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = normalizeName(arr[i]);
        }
    }

    // Hàm chuẩn hóa tên
    public static String normalizeName(String name) {
        String[] parts = name.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            result.append(Character.toUpperCase(part.charAt(0)))
                  .append(part.substring(1).toLowerCase())
                  .append(" ");
        }
        return result.toString().trim();
    }
}
