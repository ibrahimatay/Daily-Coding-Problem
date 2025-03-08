package com.ibrahimatay;

public class Problem25 {

    /*
    Implement regular expression matching with the following special characters:

    . (period) which matches any single character
    (asterisk) which matches zero or more of the preceding element
    That is, implement a function that takes in a string and a valid regular expression and returns whether or not the string matches the regular expression.

    For example, given the regular expression "ra." and the string "ray", your function should return true. The same regular expression on the string "raymond" should return false.

    Given the regular expression ".*at" and the string "chat", your function should return true. The same regular expression on the string "chats" should return false.

    This problem was asked by Facebook.
    * */

    public static boolean solution(String text, String pattern) {
        return matchHelper(text, pattern, 0, 0);
    }

    private static boolean matchHelper(String text, String pattern, int i, int j) {
        if (j == pattern.length()) {
            return i == text.length();
        }

        boolean firstMatch = (i < text.length() &&
                (pattern.charAt(j) == text.charAt(i) || pattern.charAt(j) == '.'));

        if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
            return matchHelper(text, pattern, i, j + 2) || (firstMatch && matchHelper(text, pattern, i + 1, j));
        } else {
            return firstMatch && matchHelper(text, pattern, i + 1, j + 1);
        }
    }
}
