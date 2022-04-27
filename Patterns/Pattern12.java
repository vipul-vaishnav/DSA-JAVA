public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n) {
        char c = '*';
        char space = ' ';
        // Outer loop runs 10 times (0 ~ 9)
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                // space
                for (int j = 0; j < i; j++) {
                    System.out.print(space);
                }
                // star
                for (int j = 0; j < n - i; j++) {
                    System.out.print(c);
                    System.out.print(space);
                }
            } else {
                // space
                for (int j = 0; j < 2 * n - (i + 1); j++) {
                    System.out.print(space);
                }
                // star
                for (int j = 0; j <= i - n; j++) {
                    System.out.print(c);
                    System.out.print(space);
                }
            }
            System.out.println();
        }
    }
}
