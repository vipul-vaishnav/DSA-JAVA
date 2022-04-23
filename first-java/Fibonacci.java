import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Fibonacci
        // 0,1,1+0 = 1, 1+1 = 2, 2+1 = 3, 3 + 2 = 5, 5 + 3 = 8,
        // 0,1,1,2,3,5,8,13,21,34,....

        int a1 = 0;
        int a2 = 1;
        System.out.println("Enter the number upto which you want fibonacci numbers: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();

        System.out.print(a1);
        System.out.print(", ");
        System.out.print(a2);
        System.out.print(", ");
        while (num > 2) {
            int result = a1 + a2;
            System.out.print(a1 + a2);
            System.out.print(", ");
            a1 = a2;
            a2 = result;
            num--;
        }
    }
}