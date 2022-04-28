public class LC1704 {
    // 1704. Determine if String Halves Are Alike
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        String a = new String("");
        String b = new String("");

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() / 2) {
                a += s.charAt(i);
            } else {
                b += s.charAt(i);
            }
        }

        // boolean result;

        int countA = countVowels(a);
        int countB = countVowels(b);

        return countA == countB;
    }

    public static int countVowels(String s) {
        // char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 65 || s.charAt(i) == 65 + 32) {
                count++;
            }
            if (s.charAt(i) == 69 || s.charAt(i) == 69 + 32) {
                count++;
            }
            if (s.charAt(i) == 73 || s.charAt(i) == 73 + 32) {
                count++;
            }
            if (s.charAt(i) == 79 || s.charAt(i) == 79 + 32) {
                count++;
            }
            if (s.charAt(i) == 85 || s.charAt(i) == 85 + 32) {
                count++;
            }
        }
        return count;
    }
}
