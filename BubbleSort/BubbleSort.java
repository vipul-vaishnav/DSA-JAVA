import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 9, 3, 1, 8, 5 };
        // Return sorted array
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int index = 1; index < arr.length - i; index++) {
                if (arr[index] < arr[index - 1]) {
                    int temp = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index - 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}
