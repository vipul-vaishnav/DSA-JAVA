public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        long n = 20;
        System.out.println(factorial(n));
        System.out.println(factorial(5));
        System.out.println(factorial(15));
        System.out.println(factorial(10));
        System.out.println("=====Zeros: ");
        System.out.println(zeros(factorial(n)));
        System.out.println(zeros(factorial(5)));
        System.out.println(zeros(factorial(15)));
        System.out.println(zeros(factorial(10)));
        System.out.println("Alternate Method");
        System.out.println(trailingZerosInFactorial(20));
        System.out.println(trailingZerosInFactorial(5));
        System.out.println(trailingZerosInFactorial(15));
        System.out.println(trailingZerosInFactorial(10));
    }

    static int zeros(long n) {
        if (n < 5) {
            return 0;
        }

        int count = 0;
        boolean terminate = false;
        while (!terminate) {
            long temp = n % 10;
            if (temp == 0) {
                count++;
            } else {
                terminate = true;
            }
            n /= 10;
        }
        return count;
    }

    static long factorial(long n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    static int trailingZerosInFactorial(int n) {
        // n is the number whose factorial's trailing zeros is to be calculated
        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res += n / i;
        }
        return res;
    }
}
