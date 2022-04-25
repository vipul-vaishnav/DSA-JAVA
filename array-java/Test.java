import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(func(n)));
    }

    public static int[] func(int n) {
        int[] output = new int[n];

        if (n == 1) {
            for (int i = 0; i < n; i++) {
                output[i] = 0;
            }
        }

        if (n != 1) {
            int randomNum = (int) (Math.random() * n);

            while (randomNum == 0) {
                randomNum = (int) (Math.random() * n);
            }

            if (n % 2 == 0) {
                for (int i = 0; i < n / 2; i++) {
                    output[i] = randomNum + i;
                    output[n - (i + 1)] = -1 * output[i];
                }
            }

            if (!(n % 2 == 0)) {
                int mid = n / 2;
                output[mid] = 0;

                for (int i = 0; i < n / 2; i++) {
                    if (i == mid)
                        continue;
                    output[i] = randomNum + i;
                    output[n - (i + 1)] = -1 * output[i];
                }
            }
        }

        return output;
    }
}
