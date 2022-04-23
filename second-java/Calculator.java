import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator in Java");
        Scanner in = new Scanner(System.in);
        boolean terminate = false;
        while (!terminate) {
            System.out.println("Enter the number a: ");
            int a = in.nextInt();
            System.out.println("Enter the number a: ");
            int b = in.nextInt();
            System.out.println("Choose the operation(+, -, *, /, %, X/x : (Exit))");
            char operation = in.next().trim().charAt(0);

            int result = 0;
            if (operation == '+') {
                result = add(a, b);
            } else if (operation == '-') {
                result = subtract(a, b);
            } else if (operation == '*') {
                result = multiply(a, b);
            } else if (operation == '/') {
                result = divide(a, b);
            } else if (operation == '%') {
                result = quotient(a, b);
            } else if (operation == 'X' || operation == 'x') {
                System.out.println("Quit");
                result = -1;
                terminate = true;
            }
            System.out.println("***RESULT: " + result +"***");
        }
        in.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int quotient(int a, int b) {
        return a % b;
    }
}