public class Prime {
    public static void main(String[] args) {
        int n = 12;
        int m = 23;
        System.out.println(isPrime(n));
        System.out.println(isPrime(m));
        System.out.println(isPrime(127));
        System.out.println(isPrimeAlter(n));
        System.out.println(isPrimeAlter(m));
        System.out.println(isPrimeAlter(127));
    }

    private static boolean isPrimeAlter(int m) {
        if (m < 2) {
            return false;
        } else if (m == 2) {
            return true;
        } else {
            for (int i = 2; i * i <= m; i++) {
                if (m % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    private static boolean isPrime(int m) {
        if (m < 2) {
            return false;
        } else if (m == 2) {
            return true;
        } else {
            for (int i = 2; i < m; i++) {
                if (m % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}
