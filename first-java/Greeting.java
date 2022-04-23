import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!");

        System.out.println("Enter the name:");

        Scanner in = new Scanner(System.in);

        String userInput = in.next();

        in.close();

        System.out.println("Hello, " + userInput);
        
    }
}