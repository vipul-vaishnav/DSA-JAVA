import java.util.*;

public class LC1 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] outputArr = new int[2];

        int idx = 0;
        while (idx < nums.length) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i == idx)
                    continue;
                sum = nums[idx] + nums[i];
                if (sum == target) {
                    outputArr[0] = i;
                    outputArr[1] = idx;
                    break;
                }
            }
            idx++;
        }

        return outputArr;
    }
}
