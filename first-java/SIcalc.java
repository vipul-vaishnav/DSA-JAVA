import java.util.Scanner;

public class SIcalc {
    public static void main(String[] args) {
        System.out.println("Welcome to java Simple Interest Calculator");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Principle Amount: ");
        int amount = in.nextInt();

        System.out.println("Enter the Interest Rate: ");
        float interestRate = in.nextFloat();

        System.out.println("Enter the time(in years): ");
        int years = in.nextInt();

        in.close();

        // SI calculation
        float SI = (amount * interestRate * years) / 100;

        System.out.println("SI: " + SI);
    }
}
