package org.example.practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseVowels {
    public static void main(String[] args) {
        String value = "hello";
        List<String> vowels = List.of("a", "e", "i", "o", "u");
        StringBuilder stringBuilder = new StringBuilder();
        List<String> vowelPosition = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
            if (vowels.contains(String.valueOf(value.charAt(i)))) {
                vowelPosition.add(String.valueOf(value.charAt(i)));
                stringBuilder.append(0);
            } else {
                stringBuilder.append(value.charAt(i));
            }
        }
        Collections.reverse(vowelPosition);
        String temp = stringBuilder.toString();
        for (String vowel : vowelPosition) {
            temp = temp.replaceFirst("0", vowel);
        }

        System.out.println(temp);
    }
}
