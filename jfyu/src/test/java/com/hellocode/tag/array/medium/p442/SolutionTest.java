package com.hellocode.tag.array.medium.p442;

import com.hellocode.tag.array.medium.p442.Solution;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void findDuplicates() {
        Solution solution = new Solution();
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = solution.findDuplicates(input);
        for (int i : result) {
            System.out.print(i + ",");
        }

    }
}