package org.example.gpt_challenge.two_pointer;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int start = 0;
        int pointer = 1;
        int count = 0;

        while (pointer < nums.length - 1) {
            if (nums[start] != nums[pointer]) {
                count++;
                start++;
                nums[start] = nums[pointer];
            }
            pointer++;
        }
        System.out.println(count + 1);
    }
}
