package com.hellocode.tag.array.medium.p442;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * 题目由于只有一次和两次，所以通过了正负值来进行区分
     * 这题个人思路对了，但在写代码上，还是考虑过多，这里通过正负值简单的处理了问题
     * 但自己想做超过2次的情况，导致过于复杂，一直有问题，不能再钻牛角尖了
     */

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                res.add(Math.abs(index + 1));
            nums[index] = -nums[index];
        }
        return res;
    }
}

