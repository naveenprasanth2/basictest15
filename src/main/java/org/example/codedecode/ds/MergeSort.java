package org.example.codedecode.ds;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] original = {1, 2, 4, 3, 5, 6, 7, 6, 5, 4, 8, 7, 88, 7, 66, 7, 7, 77, 99, 99, 9999, 1};
        System.out.println(Arrays.toString(original));
        mergeSort(original);
        System.out.println(Arrays.toString(original));
    }

    private static void mergeSort(int[] original) {

        if (original.length < 2) return;

        int mid = original.length / 2;
        int[] left = new int[mid];
        int[] right = new int[original.length - mid];

        System.arraycopy(original, 0, left, 0, mid);
        System.arraycopy(original, mid, right, 0, right.length);
        mergeSort(left);
        mergeSort(right);
        merge(original, left, right);
    }

    private static void merge(int[] original, int[] left, int[] right) {
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
