import java.util.Arrays;

public class LC1470 {
    //1470. Shuffle the Array
    public static void main(String[] args) {
        int[] input = {1,2,3,4,4,3,2,1};
        // Output: [1, 4, 2, 3, 3, 2, 4, 1]
        int n = 4;
        System.out.println(Arrays.toString(shuffle(input, n))); //SOL1
        System.out.println(Arrays.toString(newArr(input, n))); //SOL2
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] output = new int[nums.length];
        for (int i = 0; i < n; i++) {
            output[2 * i] = nums[i];
            output[2 * i + 1] = nums[i + n];
        } 
        return output;
    }
    
    public static int[] newArr(int[] arr, int n) {
        int[] output = new int[arr.length];
        int idx = 0;
        int count = n - 1;

        while (idx < arr.length) {
            if (isEven(idx)) {
                output[idx] = arr[idx / 2];
            } else {
                output[idx] = arr[idx + count];
                count--;
            }
            idx++;
        }

        return output;
    }

    public static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
