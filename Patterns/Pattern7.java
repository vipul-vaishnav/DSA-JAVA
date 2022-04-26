public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int n) {
        char c = '*';
        char spacech = ' ';

        for (int line = 0; line < n; line++) {
            // space
            for (int space = 0; space < line; space++) {
                System.out.print(spacech);
            }
            // star
            for (int star = 0; star < n - line; star++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
