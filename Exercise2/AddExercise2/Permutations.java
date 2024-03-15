import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        generatePermutations(arr, 0);
    }

    public static void generatePermutations(int[] arr, int index) {
        if (index == arr.length - 1) {
            printArray(arr);
        } else {
            for (int i = index; i < arr.length; i++) {
                swap(arr, index, i);
                generatePermutations(arr, index + 1);
                swap(arr, index, i);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
