package com.hellocode.tag.array.medium.p238;

public class Solution {
    /**
     * 当时毫无思路，事后看了答案
     * 但你无法用除法时，你就只能精确得将每一个乘数相乘
     * 由于为O(n)，所以必须是一些结果用到了之前的结果，否则无法压低时间复杂度
     * 又不能额外的空间，只有一个返回数组可以用，意味着，辅助的结构只能在原数组和结果数组上保存
     * 然后就是巧妙地借助了左右的概念
     * 再来一次，还是想不出
     */

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                left = left * nums[i - 1];
            }
            res[i] = left;
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1) {
                right = right * nums[i + 1];
            }
            res[i] = right * res[i];
        }

        return res;
    }
}