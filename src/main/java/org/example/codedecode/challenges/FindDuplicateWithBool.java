package org.example.codedecode.challenges;

public class FindDuplicateWithBool {
    public static void main(String[] args) {
        String str1 = "characters";
        boolean[] booleans = new boolean[256];
        char[] chars = str1.toCharArray();
        for (char c : chars){
            if (booleans[c]){
                System.out.println(c);
            }else {
                booleans[c] = true;
            }
        }
    }
}
