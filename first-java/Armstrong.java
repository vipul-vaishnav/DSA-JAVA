import java.util.Arrays;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong Number Checker");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        in.close();
        int numOfDigits = 0;
        int temp1 = num;
        while(temp1 > 0) {
            temp1 /= 10;
            numOfDigits++;
        }
        System.out.println("Digits: " + numOfDigits);

        int[] digitsArr = new int[numOfDigits];
        int temp2 = num;
        int idx = numOfDigits - 1;
        while(temp2 > 0) {
            digitsArr[idx] = temp2 % 10;
            temp2 /= 10;
            idx--;
        }
        System.out.println(Arrays.toString(digitsArr));

        int result = 0;
        for (int i = 0; i < digitsArr.length; i++) {
            result += Math.pow(digitsArr[i], digitsArr.length);
        }

        if (num == result) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
