public class LC1832 {
    // 1832. Check if the Sentence Is Pangram
    // A pangram is a sentence where every letter of the English alphabet appears at
    // least once.
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence2 = "leetcode";
        System.out.println(checkIfPangram(sentence));
        System.out.println(checkIfPangram(sentence2));
    }

    public static boolean checkIfPangram(String sentence) {
        char[] charArr = new char[sentence.length()];

        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = sentence.charAt(i);
        }

        char[] output = new char[26];

        int idx = 0;

        while (idx < 26) {
            for (int i = 0; i < charArr.length; i++) {
                if (!find(output, charArr[i])) {
                    output[idx] = charArr[i];
                }
            }
            idx++;
        }

        boolean result = false;

        if (find(output, Character.MIN_VALUE)) {
            result = false;
        } else {
            result = true;
        }

        return result;
    }

    public static boolean find(char[] arr, char ch) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (ch == arr[i]) {
                result = true;
            }
        }
        return result;
    }
}
