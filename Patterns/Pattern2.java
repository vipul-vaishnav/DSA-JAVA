public class Pattern2 {
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
        // *****

        int n = 5;
        print(n);
    }

    public static void print(int n) {
        char star = '*';
        for (int row = 0; row < n; row++) {
            for (int i = 0; i <= row; i++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
