public class Pattern4 {

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n) {
        // char star = '*';
        for (int line = 1; line < n + 1; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
