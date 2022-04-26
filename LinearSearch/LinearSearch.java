public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { -2, 7, 11, 19, 77, -81, 24, -67 };

        // find the position/index in the array where 77 is present

        int el = 77;
        int index = 0;
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                index = i;
            }
        }

        pos = index + 1;
        System.out.println("Index of Element: " + index + "\nPosition of Element: " + pos);

        // Best Case complexity => o(1)
        // Worst Case complexity => o(n)
        // best case is that element is present at the 0th index (constant time
        // complexity)
        // worst case is that the element is present at the last index of the array
        // (linear time complexity)
        // n is the number of elements in the array
    }
}
