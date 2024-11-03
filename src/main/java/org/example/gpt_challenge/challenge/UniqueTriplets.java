package org.example.gpt_challenge.challenge;

import java.util.ArrayList;
import java.util.List;

public class UniqueTriplets {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target = 0;
        List<List<Integer>> test = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < nums.length; ) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                tempList.add(nums[j]);
                sum += nums[j];
            }
            if (sum == target) {
                test.add(tempList);
                i += 3;
            } else {
                i++;
            }
            System.out.println(tempList);
            tempList.clear();
            System.out.println(test);
        }
        System.out.println(test);
    }
}
