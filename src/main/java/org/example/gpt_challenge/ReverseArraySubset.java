package org.example.gpt_challenge;

import java.util.Arrays;

public class ReverseArraySubset {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 11, 9, 7, 19, 17, 15};
        int n = 3;
        int[] straightArray = new int[n];
        int[] reverseArray = new int[n];
        int[] resultArray = new int[array.length];
        int resultIndex = 0;
        for (int i = 0; i < array.length; i += n) {
            //creating straightArray array
            int straightIndex = 0;
            for (int j = i; j < i + n; j++) {
                straightArray[straightIndex++] = array[j];
            }
            //reversing it
            int reverseIndex = 0;
            for (int k = straightArray.length - 1; k >= 0; k--) {
                reverseArray[reverseIndex++] = straightArray[k];
            }

            for (int l = 0; l < reverseArray.length; l++) {
                resultArray[resultIndex++] = reverseArray[l];
            }
        }

        System.out.println(Arrays.toString(resultArray));
    }
}
