public class Pattern5 {

    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n) {
        char star = '*';
        for (int line = 1; line < 2 * n; line++) {
            if (line < n + 1) {
                for (int i = 1; i <= line; i++) {
                    System.out.print(star);
                }
            } else {
                for (int i = 1; i <= 2 * n - line; i++) {
                    System.out.print(star);
                }
            }
            System.out.println();
        }
    }
}
