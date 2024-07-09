package org.example.gpt_challenge;

import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merged = merge(intervals);

        System.out.println(Arrays.deepToString(merged));
    }

    private static int[][] merge(int[][] intervals) {
        int[][] merged = new int[intervals.length][2];
        int index = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] >= intervals[i + 1][0]) {
                merged[index][0] = intervals[i][0];
                merged[index][1] = intervals[i + 1][1];
                i++;
            } else {
                merged[index][0] = intervals[i][0];
                merged[index][1] = intervals[i][1];
            }
            index++;
        }
        return merged;
    }
}
