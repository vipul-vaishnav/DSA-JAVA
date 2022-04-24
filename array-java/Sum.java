import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9}; //45
        int[][] arr2 = { {1,2,3,4}, {21, 22, 23, 24, 25}, {19, 17, 15, 13} };

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int sum2 = 0;
        int count = arr.length - 1;
        while (count >= 0) {
            sum2 += arr[count];
            count--;
        }

        int[] sumArr = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            int sumx = 0;
            for (int j = 0; j < arr2[i].length; j++) {
                sumx+=arr2[i][j];
            }
            sumArr[i] = sumx;
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < sumArr.length; i++) {
            if (sumArr[i] > maxSum) {
                maxSum = sumArr[i];
            }
        }

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(Arrays.toString(sumArr));
        System.out.println("MAX: " + maxSum);
    }
}
