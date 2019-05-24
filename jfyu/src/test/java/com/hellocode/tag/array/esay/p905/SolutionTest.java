package com.hellocode.tag.array.esay.p905;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sortArrayByParity() {
        int[] input = {3, 1, 2, 4};

        Solution solution = new Solution();
        int[] result = solution.sortArrayByParity(input);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }


    }
}