public class LC1732 {
    // 1732. Find the Highest Altitude
    public static void main(String[] args) {
        int[] gain = { -4, -3, -2, -1, 4, 3, 2 };
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int[] altitudeArr = new int[gain.length + 1];
        altitudeArr[0] = 0;

        int idx = 1;
        while (idx < altitudeArr.length) {
            altitudeArr[idx] = altitudeArr[idx - 1] + gain[idx - 1];
            idx++;
        }

        // // System.out.println(Arrays.toString(altitudeArr));
        return findMax(altitudeArr);
    }

    public static int findMax(int[] arr) {
        int result = arr[0];
        for (int j : arr) {
            if (result <= j) {
                result = j;
            }
        }
        return result;
    }
}
