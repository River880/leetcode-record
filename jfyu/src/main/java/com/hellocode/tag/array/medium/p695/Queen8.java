package com.hellocode.tag.array.medium.p695;

public class Queen8 {
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
    //int 0不用，int[1]=2代表在第一列上，放在第二行,1<=a[i]<=8
    int[] locations = new int[9];
    int count = 0;

    public static void main(String[] args) {
        Queen8 queen8 = new Queen8();
        queen8.search(1);
        System.out.println("count " + queen8.count);
    }

    public void search(int depth) {
        if (depth > 8) {
            count++;
            System.out.println("find the result");
            for (int i = 1; i <= 8; i++) {
                System.out.print(locations[i] + ",");
            }
        } else {
            for (int i = 1; i <= 8; i++) {
                locations[depth] = i;
                boolean condition = true;
                for (int j = 1; j < depth; j++) {
                    condition = false;
                    //横不等
                    if (locations[j] == locations[depth]) break;
                    //斜线24象限不等
                    if (locations[j] - j == locations[depth] - depth) break;
                    //斜线13象限
                    if (locations[j] + j == locations[depth] + depth) break;
                    //都符合，递归下一个节点
                    condition = true;
                }
                if (condition == true) {
                    search(depth + 1);
                }
            }
        }
    }

}
