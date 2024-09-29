package org.example.practise;

import java.util.HashSet;
import java.util.Set;

public class FindUncommon {
    static String str1 = "characters";
    static String str2 = "alphabets";
    static Set<Character> set;
    static {
        set = new HashSet<>();
    }

    public static void main(String[] args) {
        char[] chars1 = str1.toCharArray();

        for (char value : chars1) {
            if (findUncommon(str2, value)) {
                set.add(value);
            }
        }
        char[] chars2 = str2.toCharArray();
        for (char c : chars2) {
            if (findUncommon(str1, c)) {
                set.add(c);
            }
        }

        System.out.println(set);
    }

    static boolean findUncommon(String destination, char c){
        return destination.indexOf(c) == -1;
    }
}
