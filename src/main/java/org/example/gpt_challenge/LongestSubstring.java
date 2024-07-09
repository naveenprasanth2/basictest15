package org.example.gpt_challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestSubstring {
    public static void main(String[] args) {
        String string = "babad";
        StringBuilder stringBuilder = new StringBuilder();
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                stringBuilder.delete(0, stringBuilder.length());
                String temp = string.substring(i, j);
                stringBuilder.append(temp);
                stringBuilder.reverse();
                if (temp.contentEquals(stringBuilder)) {
                    strings.add(temp);
                }
            }
        }

        strings.sort((x1, x2) -> x2.length() - x1.length());

        System.out.println(strings);

        System.out.println(strings.getFirst());
    }
}
