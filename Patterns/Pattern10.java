public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n) {
        char c = '*';
        char space = ' ';
        // Outer loop runs 5 times
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - (i + 1); j++) {
                System.out.print(space);
            }
            // star
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
                System.out.print(space);
            }
            System.out.println();
        }
    }
}
