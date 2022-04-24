import java.util.Scanner;

// SUM of first n natural numbers
public class Index {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        boolean valid = false;
        int num = in.nextInt();
        while(!valid) {
            if (num < 0) {
                System.out.println("Enter a valid number");
                num = in.nextInt();
            } else {
                valid = true;
            }
        }
        // Find sum
        System.out.println("SUM: " + sum(num));
        in.close();
    }

    public static int sum(int a) {
        int output = 0;
        int num = a;
        while (num > 0) {
            output += num;
            num--;
        }
        return output;
    }
}
