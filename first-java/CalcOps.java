import java.util.Scanner;

public class CalcOps {
    public static void main(String args[]) {
        System.out.println("Welcome to Calc in Java");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();

        boolean terminate = false;

        while (!terminate) {
            char c = in.next().trim().charAt(0);

            int result = 0;

            if (c == '+') {
                result = num1 + num2; 
            } else if (c == '-') {
                result = num1 - num2;
            } else if (c == '*') {
                result = num1 * num2;
            } else if (c == '/') {
                result = num1 / num2;
            } else if (c == '%') {
                result = num1 % num2;
            } else {
                System.out.println("ERROR 404");
                terminate = true;
            }

            System.out.println("RESULT: "+result);
        }

        in.close();
    }
}
