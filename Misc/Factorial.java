public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int m = 8;
        System.out.println(factorial(n));
        System.out.println(factorial(m));
        System.out.println(fact(n));
        System.out.println(fact(m));
        System.out.println(factorial(1));
        System.out.println(fact(1));
    }

    public static int factorial(int m) {
        if (m == 0 || m == 1)
            return 1;
        return m * factorial(m - 1);
    }

    public static int fact(int k) {
        int res = 1;
        for (int i = 2; i < k + 1; i++) {
            res *= i;
        }
        return res;
    }
}
