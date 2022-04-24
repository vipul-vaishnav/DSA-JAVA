import java.util.Arrays;

public class LC1389 {
    public static void main(String[] args) {
        // 1389. Create Target Array in the Given Order
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
        int[] nums2 = { 1, 2, 3, 4, 0 };
        int[] index2 = { 0, 1, 2, 3, 0 };
        System.out.println(Arrays.toString(createTargetArray(nums2, index2)));

        // int el = 200;
        // int idx = 3;
        // insert(nums, el, idx);
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] out = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            insert(out, nums[i], index[i]);
        }
        return out;
    }

    public static void insert(int[] arr, int element, int index) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;

        // System.out.println(Arrays.toString(arr));
    }
}
