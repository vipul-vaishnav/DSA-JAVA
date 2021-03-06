public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n) {
        char ch = '*';
        char space = ' ';

        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(space);
            }

            // star
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
