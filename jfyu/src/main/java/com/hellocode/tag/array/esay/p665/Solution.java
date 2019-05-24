package com.hellocode.tag.array.esay.p665;

public class Solution {

    public boolean checkPossibility(int[] nums) {
        if (nums.length < 3) {
            return true;
        }
        int count = 0;
        int index = 0;
        boolean flag = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                continue;
            } else {
                count++;
                boolean checkResult = checkCount(count);
                if (!checkResult) {
                    flag = false;
                    break;
                }
                if (i == 0) {
                    index = i;
                }
                if (i == nums.length - 1) {
                    index = nums.length - 1;
                }
                if (0 < i && i < nums.length - 2) {
                    if (nums[i - 1] < nums[i + 1]) {
                        index = i;
                    } else if (nums[i] <= nums[i + 2]) {
                        index = i + 1;
                        nums[i + 1] = nums[i];
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
        }
        return flag;
    }

    boolean checkCount(int count) {
        if (count > 1) {
            return false;
        } else {
            return true;
        }
    }
}
