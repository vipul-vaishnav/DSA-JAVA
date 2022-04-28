// 709. To Lower Case
// package com.company;

public class LC709 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(lower(str));
        System.out.println(toLowerCase(str));
    }

    static String toLowerCase(String s) {
        String lowerCaseStr = new String("");

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) >= 65 && s.charAt(index) <= 90) {
                lowerCaseStr += (char) (s.charAt(index) + 32);
            } else {
                lowerCaseStr += s.charAt(index);
            }
        }

        return lowerCaseStr;
    }

    static String lower(String s) {
        return s.toLowerCase();
    }
}
