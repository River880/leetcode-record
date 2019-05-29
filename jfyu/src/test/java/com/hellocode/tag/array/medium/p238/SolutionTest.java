package com.hellocode.tag.array.medium.p238;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void productExceptSelf() {
        Solution solution = new Solution();
        int[] input = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(input);
        for (int i : result) {
            System.out.print(i + ",");
        }
    }
}