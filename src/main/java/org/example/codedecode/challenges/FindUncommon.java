package org.example.codedecode.challenges;

import java.util.HashSet;

public class FindUncommon {
    static String str1 = "characters";
    static String str2 = "alphabets";

    public static void main(String[] args) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char c : chars1){
            if (findUncommon(str2, c)){
                set.add(c);
            }
        }

        for (char c : chars2){
            if (findUncommon(str1, c)){
                set.add(c);
            }
        }

        System.out.println(set);
    }

    private static boolean findUncommon(String str, char i) {
        return str.indexOf(i) == -1;
    }

}
