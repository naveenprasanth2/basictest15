package org.example.gpt_challenge.challenge1;

public class FindDuplicate {
    public static void main(String[] args) {
        String input = "Naveen is a good boy".replaceAll(" ", "");
        boolean[] seen = new boolean[256];
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            if (!seen[aChar]) {
                seen[aChar] = true;
            } else {
                System.out.println(STR."The character \{aChar} is duplicate");
            }
        }
    }
}
