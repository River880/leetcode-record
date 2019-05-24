package com.hellocode.tag.array.esay.p665;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void checkPossibility() {
        Solution solution = new Solution();
        int[] input = {1, 3, 2};
        boolean flag = solution.checkPossibility(input);
        System.out.println(flag);
    }
}