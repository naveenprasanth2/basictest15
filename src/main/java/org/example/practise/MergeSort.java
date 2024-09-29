package org.example.practise;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {2, 3, 2, 1, 3, 4, 5, 6, 5, 4, 3, 2};
        System.out.println(Arrays.toString(a));
        split(a);
        System.out.println(Arrays.toString(a));
    }


    private static void split(int[] splitter) {
        if (splitter.length == 1) return;
        int size = splitter.length;
        int middle = size / 2;
        int[] left = new int[middle];
        int[] right = new int[size - middle];

        System.arraycopy(splitter, 0, left, 0, left.length);
        System.arraycopy(splitter, middle, right, 0, right.length);
        split(left);
        split(right);
        join(left, right, splitter);
    }

    private static void join(int[] left, int[] right, int[] splitter) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                splitter[k++] = left[i++];
            } else {
                splitter[k++] = right[j++];
            }
        }

        while (i < left.length) {
            splitter[k++] = left[i++];
        }

        while (j < right.length) {
            splitter[k++] = right[j++];
        }
    }

}
