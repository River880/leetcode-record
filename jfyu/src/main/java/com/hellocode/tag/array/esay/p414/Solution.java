package com.hellocode.tag.array.esay.p414;

public class Solution {
    public int thirdMax(int[] nums) {
        int max = 0;
        int sec_max = 0;
        int third_max = 0;
        int temp;
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        if (length == 2) {
            return third_max = nums[1] > nums[0] ? nums[0] : nums[1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                max = sec_max = third_max = nums[i];
                continue;
            }
            if (nums[i] == third_max || nums[i] == sec_max || nums[i] == max) {
                continue;
            } else {
                temp = nums[i];
                if (temp < third_max) continue;
                if (third_max < temp && temp < sec_max) {
                    third_max = temp;

                } else if (sec_max < temp && temp < max) {
                    third_max = sec_max;
                    sec_max = temp;
                } else
            }


            int temp = nums[i];
            if (third_max < temp && temp < sec_max) {
                third_max = nums[i];
            } else
        }
    }
}
