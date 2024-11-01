package org.example.interview.linkedin;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        boolean lastIndexReached = false;
        for (int i = 0; i < nums.length; i++) {
            if (i + nums[i] == nums.length) {
                lastIndexReached = true;
                break;
            } else if (i + nums[i] > nums.length - 1) {
                break;
            }
            i = i + nums[i];
        }
        System.out.println(lastIndexReached);
    }
}
