public class LC1295 {
    // 1295. Find Numbers with Even Number of Digits
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        // System.out.println(1 % 2);
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((numOfDigits(nums[i])) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int numOfDigits(int num) {
        int digits = 0;

        if (num < 0) {
            num *= -1;
        }

        if (num == 0) {
            digits = 1;
        }

        while (num != 0) {
            digits++;
            num /= 10;
        }

        return digits;
    }
}
