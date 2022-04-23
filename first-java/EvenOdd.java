import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!");

        System.out.println("Enter the number:");

        Scanner in = new Scanner(System.in);

        int userInput = in.nextInt();

        in.close();
        
        if (userInput % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
        
    }
}