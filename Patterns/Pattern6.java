public class Pattern6 {
    // *
    // **
    // ***
    // ****
    // *****

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n) {
        char c = '*';
        char space = ' ';
        for (int i = 1; i < n + 1; i++) {
            // for space
            for (int j = 1; j < n + 1 - i; j++) {
                System.out.print(space);
            }
            // for star
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
