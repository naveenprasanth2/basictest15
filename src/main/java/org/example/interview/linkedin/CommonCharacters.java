package org.example.interview.linkedin;

import java.util.HashSet;
import java.util.Set;

public class CommonCharacters {
    static String str1 = "KIRUTHIKA";
    static String str2 = "JAYANTHIKA";

    public static void main(String[] args) {
        char[] chars1 = str1.toCharArray();
        for (char c : chars1) {
            if (!isFound(str2, c)) {
                System.out.print(c);
            }
        }


    }

    private static boolean isFound(String str, char c) {
        return str.indexOf(c) != -1;
    }
}
