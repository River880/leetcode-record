package com.hellocode.tag.array.medium.p955;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void deckRevealedIncreasing() {
        Solution solution = new Solution();
        int[] input = {17, 13, 11, 2, 3, 5, 7};
        int[] result = solution.deckRevealedIncreasing(input);
        for (int i : result) {
            System.out.print(i + ",");
        }

    }
}