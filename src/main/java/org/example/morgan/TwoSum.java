package org.example.morgan;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 11;
        Map<Integer, Integer> test = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (test.getOrDefault(val, -1) != -1) {
                System.out.println(STR."\{i}, \{test.get(val)}");
                break;
            }else {
                test.put(nums[i], i);
            }
        }
    }
}
