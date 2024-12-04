package org.example.codedecode.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumArrangement {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 6, 4};
        List<Integer> list = new ArrayList<>(Arrays.stream(array).boxed().toList());
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int value = list.remove(j + 1);
                    list.add(j, value);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
