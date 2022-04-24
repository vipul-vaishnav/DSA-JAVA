import java.util.Arrays;

public class LC1365 {
    // 1365. How Many Numbers Are Smaller Than the Current Number
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] nums2 = { 7, 7, 7, 7 };
        int[] nums3 = { 6, 5, 4, 8 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums2)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums3)));
    }

    // public static int[] smallerNumbersThanCurrent(int[] nums) {
    // int[] newArr = new int[nums.length];
    // int idx = 0;
    // while (idx < nums.length) {
    // int count = 0;
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] < nums[idx]) {
    // count++;
    // }
    // }
    // newArr[idx] = count;
    // idx++;
    // }
    // return newArr;
    // }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        int idx = 0;
        int count = 0;

        while (idx < nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (i != idx) {
                    if (nums[idx] > nums[i]) {
                        count++;
                    }
                }
            }
            output[idx] = count;
            count = 0;
            idx++;
        }

        return output;
    }
}
