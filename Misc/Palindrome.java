public class Palindrome {
    public static void main(String[] args) {
        int n = 785332;
        int k = 373;
        int j = 1234321;
        int m = 3;

        System.out.println(checkIfPalindrome(n));
        System.out.println(checkIfPalindrome(k));
        System.out.println(checkIfPalindrome(j));
        System.out.println(checkIfPalindrome(m));
        // Reverse
        System.out.println("Reverse Number: \n");
        System.out.println(reverse(n));
        System.out.println(reverse(k));
        System.out.println(reverse(j));
        System.out.println(reverse(m));
    }

    public static boolean checkIfPalindrome(int n) {
        if (countDigits(n) == 1) {
            return true;
        } else {
            return n == reverse(n);
        }
    }

    public static int reverse(int n) {
        int reverse = 0;
        while (n != 0) {
            int temp = n % 10;
            n /= 10;
            reverse = reverse * 10 + temp;
        }
        return reverse;
    }

    public static int countDigits(int n) {
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
}
