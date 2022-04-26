// import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(nums, k);
        // System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int temp = 0;
        while (temp < k) {
            int first = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[nums.length - 1] = first;
            temp++;
        }
    }
}
