import java.util.Arrays;

// Convert number to reversed array of digits
// Given a random non-negative number, you have to return the digits of this
// number within an array in reverse order.
public class Kafka1 {
    public static void main(String[] args) {
        // 348597 => [7,9,5,8,4,3]
        // 0 => [0]

        int m = 0;
        int n = 348597;
        // System.out.println(countDigits(m));
        // System.out.println(countDigits(n));
        System.out.println(Arrays.toString(digitize(m)));
        System.out.println(Arrays.toString(digitize(n)));
    }

    static int[] digitize(long n) {
        if (n == 0)
            return new int[] { 0 };

        int[] out = new int[countDigits(n)];
        int idx = 0;
        while (n > 0) {
            out[idx] = (int) n % 10;
            n /= 10;
            idx++;
        }

        return out;
    }

    static int countDigits(long n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }
}