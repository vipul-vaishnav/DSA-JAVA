import java.util.Arrays;

public class LC1929 {
    // 1929. Concatenation of Array
    public static void main(String[] args) {
        System.out.println("leetcode 1929");
        int[] nums = {1,3,2,1};
        // Output: [1,3,2,1,1,3,2,1]
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }    

    public static int[] getConcatenation(int[] nums) {
            //          0 ms solution  
            //         int[] output = new int[nums.length * 2];
            //         for (int i = 0; i < arr.length; i++) {
            //             output[i] = arr[i];
            //             output[i + arr.length] = arr[i];
            //         }
            //         return output;

        int[] newArray = new int[nums.length * 2];
        for (int i = 0; i < newArray.length; i++) {
            if (i < nums.length)
                newArray[i] = nums[i];
            else 
                newArray[i] = nums[i - nums.length];
        }
        return newArray;
    }
}
