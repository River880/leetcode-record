package com.hellocode.tag.array.esay.p832;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int rows = A.length;
        int columns = A[0].length;
        int temp = 0;
        boolean odd = false;
        if (columns % 2 == 1) odd = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns / 2; j++) {
                //翻转
                temp = A[i][j];
                A[i][j] = A[i][(columns - 1) - j];
                A[i][(columns - 1) - j] = temp;
                //反转 1-binary,这里要区分数组大小是否为奇数，奇数中间的数虽然不需要翻转，但仍然需要反转
                A[i][j] = 1 - A[i][j];
                A[i][(columns - 1) - j] = 1 - A[i][(columns - 1) - j];
            }
            if (odd) {
                A[i][columns / 2] = 1 - A[i][columns / 2];
            }
        }

        return A;
    }
}
