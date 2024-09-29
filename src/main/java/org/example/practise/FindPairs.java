package org.example.practise;

import java.util.Arrays;

public class FindPairs {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3};
        System.out.println(Arrays.toString(a));
        mergeSort(a);
        for (int i = 0; i < a.length -1;){
            if (a[i] == a[i+1]){
                System.out.println(STR."The pair is {\{a[i]}, \{a[i+1]}}");
                i+=2;
            }else {
                i++;
            }
        }
    }

    private static void mergeSort(int[] array) {
        if (array.length == 1) return;
        int middle = array.length / 2;
        int[] left = new int[middle];
        int[] right = new int[array.length - middle];
        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, middle, right, 0, right.length);
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }

    private static void merge(int[] left, int[] right, int[] array) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
