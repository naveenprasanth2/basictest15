package org.example.challenges;

import java.util.List;

public class ReverseVowels {
    public static void main(String[] args) {
        String value = "hello";
        List<String> vowels = List.of("a", "e", "i", "o", "u");
        StringBuilder original = new StringBuilder();
        StringBuilder reversed = new StringBuilder();
        for (String val : value.split("")) {
            if (!vowels.contains(val)) {
                original.append(val);
            } else {
                original.append("_");
                reversed.append(val);
            }
        }

        reversed.reverse();
        String available = original.toString();
        String replaceable = reversed.toString();
        int j = 0;
        for (int i = 0; i < available.length(); i++) {
            if (available.charAt(i) == '_') {
                available = available.replaceFirst("_", String.valueOf(replaceable.charAt(j)));
                j++;
            }
        }

        System.out.println(available);
    }
}
