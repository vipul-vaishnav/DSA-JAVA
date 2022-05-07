import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int num = 155478;
        System.out.println(countDigits(num));
        System.out.println(countRecDigits(num));
        System.out.println(countLogDigits(num));
    }

    static int countDigits(int n) {
        int output = 0;

        if (n == 0) {
            return 1;
        }

        while (n != 0) {
            n /= 10;
            output++;
        }
        return output;
    }

    static int countRecDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + countDigits(n / 10);
        }
    }

    static int countLogDigits(int n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }
}
