import java.util.Arrays;

public class LC1920 {
    // 1920. Build Array from Permutation
    public static void main(String[] args) {
        int[] input = {0,2,1,5,3,4};
        int[] input2 ={5,0,1,2,3,4};
        System.out.println(Arrays.toString(output(input)));
        System.out.println(Arrays.toString(output(input2)));
    }

    // public static int[] output(int[] nums) {
    //     int[] output = new int[nums.length];
    //     int[] idxArray = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         idxArray[i] = nums[i];
    //     }
    //     for (int i = 0; i < output.length; i++) {
    //         output[i] = nums[idxArray[i]];
    //     }
    //     return output;
    // }

    public static int[] output(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[nums[i]];
        }
        return output;
    }
}
