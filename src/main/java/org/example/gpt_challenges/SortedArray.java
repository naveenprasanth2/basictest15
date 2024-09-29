package org.example.gpt_challenges;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4};

        // Array 2 with 2 elements
        int[] array2 = {2, 5, 6};

        int[] result = new int[array1.length + array2.length];

        int i = array1.length - 1, j = array2.length - 1, k = result.length - 1;

        while (i >= 0 && j >=0) {
            if (array1[i] >= array2[j]) {
                result[k--] = array1[i--];
            } else {
                result[k--] = array2[j--];
            }
        }

        while (i >= 0) {
            result[k--] = array1[i--];
        }

        while (j >= 0) {
            result[k--] = array2[j--];
        }

        System.out.println(Arrays.toString(result));
    }
}
