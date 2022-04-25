package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        // ARRAY MUST BE SORTED
        int[] arr = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
        int target = 14;

        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // 1. Find middle element
        // int mid = start + (end - start) / 2;

        // 2. if target < arr[mid] => end = mid - 1;

        // 3. if target > arr[mid] => start = mid + 1;

        // 4. if start == end => return mid;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // Ans found
                return mid;
            }
        }

        return -1;
    }
}
