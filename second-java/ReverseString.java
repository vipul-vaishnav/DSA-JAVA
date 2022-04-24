import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        
        // Original String
        System.out.println();
        System.out.println("ORIGINAL STRING====>");
        System.out.println(str);
        scanner.close();
        
        // REVERSE STRING
        int len = str.length();
        String newStr = "";
        for (int i = len - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        System.out.println();
        System.out.println("REVERSED STRING====>");
        System.out.println(newStr);
    }
}
