package org.example.synechron;

import java.util.Set;
import java.util.TreeSet;

public class FindUncommonCharacter {
    static String str1 = "characters";
    static String str2 = "alphabets";

    public static void main(String[] args) {
        Set<Character> test = new TreeSet<>();
        for (int i = 0; i < str1.length(); i++) {
            if (findUncommon(str1.charAt(i), str2)) {
                test.add(str1.charAt(i));
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (findUncommon(str2.charAt(i), str1)) {
                test.add(str2.charAt(i));
            }
        }

        System.out.println(test);
    }

    private static boolean findUncommon(char c, String str) {
        return str.indexOf(c)  == -1;
    }
}
