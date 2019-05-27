package com.hellocode.tag.array.esay.p414;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution2 {
    /**
     * 使用了priority和set两种数据结构
     * 但通过辅助措施，使得set的大小为3
     * priorityQueue,默认是个最小堆
     * 指定Comparator可以改为最大堆，这里用最小堆，可以在堆>3时，去除第四个元素，使得pq大小也为3
     * 即set和priority在空间利用率上也非常高校，都只有3个值
     */


    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue(4);
        Set<Integer> set = new HashSet<>();
        for (Integer n : nums) {
            if (set.contains(n)) continue;
            pq.add(n);
            set.add(n);
            //将set的值保持在3
            if (pq.size() > 3) {
                set.remove(pq.poll());
            }
        }
        if (pq.size() >= 3) {
            return pq.peek();
        } else {
            while (pq.size() > 1) {
                pq.poll();
            }
            return pq.peek();
        }

    }
}
