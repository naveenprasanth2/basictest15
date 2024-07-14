package org.example.gpt_challenge;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] array = {-1, 5, 7, 7, 8, 8, 10, -1};
        int target = -1;
        boolean isFound = false;
        int first = -1;
        int last = -1;

        for (int i = 0; i < array.length; i++){
            if (array[i] == target){
                if (!isFound){
                    first = i;
                    isFound = true;
                }
                last = i;
            }
        }

        System.out.println(first);
        System.out.println(last);
    }
}
