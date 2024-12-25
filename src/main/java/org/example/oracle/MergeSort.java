package org.example.oracle;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] originalArray) {
        if (originalArray.length < 2) return;

        int mid = originalArray.length / 2;

        int[] left = new int[mid];
        int[] right = new int[originalArray.length - mid];

        System.arraycopy(originalArray, 0, left, 0, mid);
        System.arraycopy(originalArray, mid, right, 0, right.length);
        sort(left);
        sort(right);
        mergeSort(originalArray, left, right);
    }

    private static void mergeSort(int[] original, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
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
