package com.hellocode.tag.array.medium.p955;


import java.util.*;


public class Solution {
    /**
     * 这题让我感到了思维上的差距
     * 这是一个知道结果去推算初始状态的题
     * 个人第一反应是去把整个过程逆向，但逆向的思维是复杂的
     * 而discussion的最优解，确是使用index，仍然通过正向的思维去进行模拟，这就很顺了
     * <p>
     * 你构造一个queue或者list等
     * 里面的值为初始状态的index
     * <p>
     * 然后进行模拟，你知道了[0,1,2,3,4,5,6]
     * 最终会变为 [0,2,4,6,3,1,5]
     * 然后你就知道了真正结果的值在原来的数组中初始index是多少
     * queue只用到了简单的头，尾操作,注意linkedList的add方法是加在last位置的
     * 这里相比于最优解，我多加了一些辅助的逻辑，是为了方便理解这个思维，直接将queue.poll,放到初始值的准确位置也是可以的，
     * 但那样会忽视这个算法最大的优点
     */
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList<>();

        int[] indexResult = new int[deck.length];
        int[] initArray = new int[deck.length];

        for (int i = 0; i < deck.length; i++) {
            queue.add(i);
        }
        int j = 0;
        while (!queue.isEmpty()) {
            indexResult[j] = queue.poll();
            if (!queue.isEmpty()) {
                queue.add(queue.poll());
            }
            j++;
        }

        for (int i = 0; i < deck.length; i++) {
            initArray[indexResult[i]] = deck[i];
        }
        return initArray;
    }

}
