package org.example.practise;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensional {
    public static void main(String[] args) {
        int[][] array1 = {{10, 15}, {30, 50}};
        int[][] array2 = {{20, 40}, {5, 10}};
        List<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (finalList.isEmpty()) {
                    finalList.add(array1[i][j]);
                }
                if (finalList.getLast() < array1[i][j]) {
                    finalList.add(array1[i][j]);
                } else if (finalList.getLast() < array2[i][j]) {
                    finalList.add(array2[i][j]);
                }
            }
        }
        System.out.println(finalList);
    }
}
