package com.hellocode.tag.array.esay.p977;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) A[i] = -1 * A[i];
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        return A;
    }
}
