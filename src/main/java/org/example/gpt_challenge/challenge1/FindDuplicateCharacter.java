package org.example.gpt_challenge.challenge1;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        String input = "Naveen is a good boy".replaceAll(" ", "");
        boolean[] seen = new boolean[256]; // ASCII size

        for (char c : input.toCharArray()) {
            if (seen[c]) {
                System.out.println(STR."\{c} is a duplicate");
            } else {
                seen[c] = true;
            }
        }
    }
}
