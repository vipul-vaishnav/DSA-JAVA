import java.util.Arrays;

public class LC1431 {
    public static void main(String[] args) {
        // 1431. Kids With the Greatest Number of Candies
        // int[] candies = {2,3,5,1,3}; 
        // int extraCandies = 3;

        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(Arrays.toString(boolArr(candies, extraCandies)));
    }

    public static boolean[] boolArr(int[] candies, int extraCandies) {
        boolean[] boolArr = new boolean[candies.length];
        int maxCandies = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        
        for (int i = 0; i < candies.length; i++) {
            boolArr[i] = (candies[i] + extraCandies >= maxCandies);
        }
        return boolArr;
    }
}