import java.util.Scanner;

public class PowerFunc {
    public static void main(String[] args) {
        System.out.println("Enter base and exponent");
        Scanner in = new Scanner(System.in);
        System.out.println("Base: ");
        int base = in.nextInt();
        System.out.println("Exponent: ");
        int exponent = in.nextInt();
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println("RESULT: " + result);
        in.close();
    }
}
