package org.example.interview;

public class Common {
    static String str1 = "ABFHJKLOZ";
    static String str2 = "CMFPHQRKS";

    public static void main(String[] args) {
        char[] strArray = str1.toCharArray();
        for (char c : strArray) {
            if (getIndex(c) >= 0) {
                System.out.println(c);
            }
        }
    }

    private static int getIndex(char character) {
        return str2.indexOf(character);
    }
}
