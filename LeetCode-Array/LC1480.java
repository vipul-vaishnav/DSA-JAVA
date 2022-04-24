import java.util.Arrays;

public class LC1480 {
    // 1480. Running Sum of 1d Array
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        // Output: [1,3,6,10]
        int[] output = runningSum(nums);
        System.out.println(Arrays.toString(output));
    }

    // public static int[] runningSum(int[] nums) {
    //     int[] arr = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         int sum = 0;
    //         int temp = i;
    //         while (temp >= 0) {
    //             sum += nums[temp];
    //             temp--;
    //         }
    //         arr[i] = sum;
    //     }
    //     return arr;
    // }
    public static int[] runningSum(int[] arr) {
        int[] output = new int[arr.length];
        int index = 1;
        output[0] = arr[0];
        while (index < arr.length) {
            output[index] = arr[index] + output[index - 1];
            index++;
        }
        return output;
    }
}
