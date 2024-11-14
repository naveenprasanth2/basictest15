package org.example.codedecode.challenges;

import java.util.HashMap;

public class FindDuplicateChar {
    public static void main(String[] args) {
        String str1 = "characters";
        HashMap<Character, Integer> test = new HashMap<>();
        for (char c : str1.toCharArray()) {
            if (test.containsKey(c)) {
                System.out.println(c);
            } else {
                test.put(c, null);
            }
        }
    }
}
