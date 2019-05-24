package com.hellocode.tag.array.esay.p665;

public class SolutionV2 {
    public boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length - 1 && cnt < 2; i++) {
            if (nums[i] > nums[i + 1]) {
                if (i == 0 || nums[i - 1] < nums[i + 1]) {
                    nums[i] = nums[i + 1];
                } else {
                    nums[i + 1] = nums[i];
                }
            }
        }

        return cnt < 2;
    }
}
