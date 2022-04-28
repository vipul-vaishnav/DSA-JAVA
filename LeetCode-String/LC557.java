public class LC557 {
    public static void main(String[] args) {
        String s = "God Ding";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s) {
        String[] strArrOne = s.split(" ");
        String[] strArr = new String[strArrOne.length];

        for (int i = 0; i < strArrOne.length; i++) {
            strArr[i] = revStr(strArrOne[i]);
        }

        String output = "";
        for (int i = 0; i < strArr.length; i++) {
            if (i < strArr.length - 1) {
                output = output + strArr[i] + " ";
            } else {
                output += strArr[i];
            }
        }
        return output;
    }

    static String revStr(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str += s.charAt(s.length() - (i + 1));
        }
        return str;
    }

}
