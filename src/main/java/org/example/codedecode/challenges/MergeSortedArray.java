package org.example.codedecode.challenges;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 10};
        int[] array2 = {4, 5, 6, 7, 8, 9};
        int[] result = new int[array2.length + array1.length];
        int i = array1.length - 1;
        int j = array2.length - 1;
        int k = result.length - 1;

        while (i >= 0 && j >= 0){
            if (array1[i] > array2[j]){
                result[k--] = array1[i--];
            }else {
                result[k--] = array2[j--];
            }
        }

        while (i >= 0){
            result[k--] = array1[i--];
        }

        while (j >= 0){
            result[k--] = array2[j--];
        }


        System.out.println(Arrays.toString(result));
    }
}
