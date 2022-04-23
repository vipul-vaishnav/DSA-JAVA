import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Java Palindrome String Checker");
        System.out.println("Enter the string: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().trim();
        in.close();
        System.out.println("STRING: " + str);

        String s = "";
        for (int j = str.length() - 1; j >= 0; j--) {
            s+=str.charAt(j);
        }
        System.out.println("Reverse String: " + s);

        // Compare string

        if (s.equals(str)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("No Palindrome String");
        }

        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) == str.charAt(i)) {
        //         System.out.println("Equal Element");
        //     } else {
        //         System.out.println("Unequal Element");
        //     }
        // }
    }
}
