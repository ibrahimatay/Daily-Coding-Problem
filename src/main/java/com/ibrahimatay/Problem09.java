package com.ibrahimatay;

public class Problem09 {

    /*
    * This problem was asked by Airbnb.

    Given a list of integers, write a function that returns the largest sum of non-adjacent numbers.
    Numbers can be 0 or negative.

    For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5]
    should return 10, since we pick 5 and 5.

    Follow-up: Can you do this in O(N) time and constant space?
    */

    public int solution(int[] array){

        if(array == null || array.length ==0)return 0;

        int swap = 0;
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            int current = Math.max(max, swap);

            max = swap + array[i];
            swap = current;
        }

        return Math.max(max, swap);
    }
}
