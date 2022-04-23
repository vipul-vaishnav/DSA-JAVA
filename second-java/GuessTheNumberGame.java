import java.util.Scanner;
import java.lang.Math;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        System.out.println("Welcome to GuessTheNumberGame in JAVA");
        System.out.println("First--Choose the level\n1.Easy!\n2.Medium!\n3.Hard!");
        Scanner input = new Scanner(System.in);
        
        // Choosing the level of the game

        boolean first = false;
        int numOfTurns = 0;

        while (!first) {
            char level = input.next().trim().charAt(0);
            if (level == 'E' || level == 'e') {
                System.out.println("Easy level!");
                numOfTurns = 10;
                first = true;
            } else if (level == 'M' || level == 'm') {
                System.out.println("Medium level!");
                numOfTurns = 8;
                first = true;
            } else if (level == 'H' || level == 'h') {
                System.out.println("Hard level!");
                numOfTurns = 5;
                first = true;
            } else {
                System.out.println("Choose a valid Option (E/e, M/m or H/h)");
            }
        }

        System.out.println("You have " + numOfTurns + " chances to guess the number correctly.");

        // Generating the number (Hidden Number)
        int hiddenNumber = randomGen();
        // System.out.println("----" + hiddenNumber + "----");

        boolean endGame = false;

        while (!endGame) {
            System.out.println("Enter your guess: ");
            int guess = input.nextInt();

            if (guess == hiddenNumber) {
                System.out.println("Congratulations! 🎉, You won!");
                endGame = true;
            } else if (guess < hiddenNumber) {
                System.out.println("Too less!, Try a number greater than " + guess);
                numOfTurns--;
                if (numOfTurns == 0) {
                    System.out.println("Lose! 😢");
                    System.out.println("You have consumed all your chances!");
                    System.out.println("Better luck next time");
                    endGame = true;
                }
            } else if (guess > hiddenNumber) {
                System.out.println("Too high, Try a number smaller than " + guess);
                numOfTurns--;
                if (numOfTurns == 0) {
                    System.out.println("Lose! 😢");
                    System.out.println("You have consumed all your chances!");
                    System.out.println("Better luck next time");
                    endGame = true;
                }
            }
        }

        input.close();
    }

    public static int randomGen() {
        int output = 0;
        double random = Math.floor(Math.random() * 20) + 1;
        output = (int)random;
        return output;
    }
}
