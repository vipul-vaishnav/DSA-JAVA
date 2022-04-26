public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n) {
        char ch = '*';
        char space = ' ';
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 0; j < n - i; j++) {
                System.out.print(space);
            }
            // star
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(ch);
            }
            // space
            for (int l = 0; l < n - i; l++) {
                System.out.print(space);
            }
            System.out.println();
        }
    }
}
