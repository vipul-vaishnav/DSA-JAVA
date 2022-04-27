import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 9, 3, 1, 8, 5 };
        // Return sorted array
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int index = start; index <= end; index++) {
            if (arr[max] < arr[index]) {
                max = index;
            }
        }

        return max;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
