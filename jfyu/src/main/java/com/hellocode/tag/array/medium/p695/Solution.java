package com.hellocode.tag.array.medium.p695;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Solution {
    /**
     * 当数学模型很难构建时，我们采用模拟的方式求解
     * 常见的模拟有3种方法：
     * 穷举法
     * 深度优先（回溯法）搜索 DFS（Depth first search）
     * 广度优先搜索 BFS（Breadth first search)
     * <p>
     * 回溯算法，采用递归的思路，根据传不传其他参数进行递归可以分为2类
     * <p>
     * 不传其余参数的递归
     * function search(depth:int)
     * begin
     * if(符合目标)
     * then
     * 输出解或者评价处理
     * else
     * for i: to 扩展可能数 do
     * if 第i种状态扩展可行 then
     * begin
     * 保存现场（断点，维护参数表）；
     * Seaerch（depth+1）
     * 恢复现场（回溯，回到上一个断点继续执行）；
     * end
     * end
     * <p>
     * 传其余参数的递归
     * function search(depth:int，其余参数表)
     * begin
     * if(符合目标)
     * then
     * 输出解或者评价处理
     * else
     * for i: to 扩展可能数 do
     * if 第i种状态扩展可行 then
     * begin
     * Seaerch（depth+1，参数表）
     * end
     * end
     */

    int max = 0;

    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] bgrid = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < bgrid.length; i++) {
            for (int j = 0; j < bgrid[0].length; j++) {
                bgrid[i][j] = false;
            }
        }
        for (int i = 0; i < bgrid.length; i++) {
            for (int j = 0; j < bgrid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int localMax = search(i, j, grid, bgrid);
                    if (max < localMax) {
                        System.out.println("local max:" + localMax + ",i:" + i + ",j:" + j);
                        max = localMax;
                    }
                }
            }
        }
        System.out.println("max area island is " + max);
        return max;
    }

    public int search(int i, int j, int[][] grid, boolean[][] bgrid) {
        int count = 0;
        //置为true，避免重复
        bgrid[i][j] = true;

        if (reachEnd(i, j, grid, bgrid)) {
            return 1;
        } else {
            count++;

            if (j != 0 && judgeNode(i, j - 1, grid, bgrid)) {
                count = count + search(i, j - 1, grid, bgrid);
            }
            if (j != grid[0].length - 1 && judgeNode(i, j + 1, grid, bgrid)) {
                count = count + search(i, j + 1, grid, bgrid);
            }
            if (i != 0 && (judgeNode(i - 1, j, grid, bgrid))) {
                count = count + search(i - 1, j, grid, bgrid);
            }
            if (i != grid.length - 1 && (judgeNode(i + 1, j, grid, bgrid))) {
                count = count + search(i + 1, j, grid, bgrid);
            }

        }
        return count;
    }

    //判断是否到达end，如果是，则返回true
    public boolean reachEnd(int i, int j, int[][] grid, boolean[][] bgrid) {
        if (j != 0 && (judgeNode(i, j - 1, grid, bgrid))) {
            return false;
        }
        if (j != grid[0].length - 1 && (judgeNode(i, j + 1, grid, bgrid))) {
            return false;
        }

        if (i != 0 && (judgeNode(i - 1, j, grid, bgrid))) {
            return false;
        }
        if (i != grid.length - 1 && (judgeNode(i + 1, j, grid, bgrid))) {
            return false;
        }
        return true;
    }

    public boolean judgeNode(int i, int j, int[][] grid, boolean[][] bgrid) {
        if ((grid[i][j] == 1) && (bgrid[i][j] == false)) {
            return true;
        } else {
            return false;
        }
    }
}
