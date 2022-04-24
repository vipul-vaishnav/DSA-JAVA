import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = {12, 14, 17, 19, 22};

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Array 2");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        // Direct
        System.out.println(Arrays.toString(arr2));

        System.out.println("Array 1");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
