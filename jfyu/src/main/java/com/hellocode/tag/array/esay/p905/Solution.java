package com.hellocode.tag.array.esay.p905;

public class Solution {

    public int[] sortArrayByParity(int[] A) {
        int length = A.length;
        int oddIndex = 0;
        int evenIndex = length - 1;

        while (oddIndex < evenIndex) {
            if (A[oddIndex] % 2 == 0) {
                oddIndex++;
                continue;
            }
            if (A[evenIndex] % 2 == 1) {
                evenIndex--;
                continue;
            }
            int temp = A[oddIndex];
            A[oddIndex] = A[evenIndex];
            A[evenIndex] = temp;
            oddIndex++;
            evenIndex--;
        }

        return A;
    }
}
