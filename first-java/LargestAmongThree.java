import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        System.out.println("Largest Among Three");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("A is largest");
            } else {
                System.out.println("C is largest");
            }
        } else {
            if (b > c) {
                System.out.println("B is largest");
            } else {
                System.out.println("C is largest");
            }
        }
        in.close();
    }
}
