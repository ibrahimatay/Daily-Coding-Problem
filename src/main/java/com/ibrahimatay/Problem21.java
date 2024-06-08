package com.ibrahimatay;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Problem21 {
    /**
    * Given an array of time intervals (start, end) for classroom lectures (possibly overlapping),
    * find the minimum number of rooms required.
    * For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.
    * */

    public int solution(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing((int[] interval) -> interval[0]));
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        int count = 0;
        for (int[] interval : intervals) {
            if (heap.isEmpty()) {
                count++;
                heap.offer(interval[1]);
            } else {
                if (interval[0] >= heap.peek()) {
                    heap.poll();
                } else {
                    count++;
                }

                heap.offer(interval[1]);
            }
        }

        return count;
    }
}
