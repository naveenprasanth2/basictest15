package org.example.gpt_challenge;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {2, 3, 2, 3, 4, 5, 4, 3, 2, 4, 5, 6, 66, 5, 7, 7, 8, 8, 77, 0, 8, 77, 66, 55, 44, 66, 77, -1};
        System.out.println(Arrays.toString(array));
        mergeMethod(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeMethod(int[] array) {
        if (array.length <= 1) return;
        int middle = array.length / 2;
        int[] left = new int[middle];
        int[] right = new int[array.length - middle];

        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, middle, right, 0, right.length);
        mergeMethod(left);
        mergeMethod(right);

        merge(array, left, right);

    }

    private static void merge(int[] original, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                original[k++] = left[i++];
            } else {
                original[k++] = right[j++];
            }
        }

        while (i < left.length) {
            original[k++] = left[i++];
        }

        while (j < right.length) {
            original[k++] = right[j++];
        }
    }
}
