import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = scanner.nextInt();
        scanner.close();

        // sum
        System.out.println("SUM: " + sum(n));
        System.out.println("SUM: " + sum2(n));
        System.out.println("SUM: " + sum3(n));

        for (int i = 1; i < 11; i = i * 2) {
            System.out.println(i);
        }
    }

    static int sum(int k) {
        return (k * (k + 1)) / 2;
    }

    static int sum2(int k) {
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += i;
        }

        return sum;
    }

    static int sum3(int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= i; j++) {
                count++;
            }
        }
        return count;
    }
}
