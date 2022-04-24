public class LC1512 {
    // 1512. Number of Good Pairs
    // Given an array of integers nums, return the number of good pairs.

    // A pair (i, j) is called good if nums[i] == nums[j] and i < j.
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        int[] nums2 = { 1, 1, 1, 1 };
        System.out.println(numIdenticalPairs(nums));
        System.out.println(numIdenticalPairs2(nums));
        System.out.println(numIdenticalPairs(nums2));
        System.out.println(numIdenticalPairs2(nums2));
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int idx = i + 1;
            while (idx < nums.length) {
                if (nums[i] == nums[idx]) {
                    count++;
                }
                idx++;
            }
        }

        return count;
    }

    public static int numIdenticalPairs2(int[] arr) {
        int count = 0;
        int idx = 0;

        while (idx < arr.length) {
            for (int i = idx + 1; i < arr.length; i++) {
                if (arr[idx] == arr[i])
                    count++;
            }
            idx++;
        }

        return count;
    }
}
