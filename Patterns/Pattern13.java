import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print(n);
        scanner.close();
    }

    public static void print(int n) {
        char star = '*';
        char space = ' ';

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                // space
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(space);
                }
                System.out.print(star);
            } else if (i > 0 && i < n - 1) {
                // space 1
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(space);
                }
                System.out.print(star);
                // space 2
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(space);
                }
                System.out.print(star);
            } else {
                for (int j = 0; j < 2 * n - 1; j++) {
                    System.out.print(star);
                }
            }
            System.out.println();
        }
    }
}
