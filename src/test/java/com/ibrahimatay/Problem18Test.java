package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem18Test {

    /*
    Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

    For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:
    ```
    10 = max(10, 5, 2)
    7 = max(5, 2, 7)
    8 = max(2, 7, 8)
    8 = max(7, 8, 7)
    ```
    Do this in O(n) time and O(k) space. You can modify the input array in-place and you do not need to store the results. You can simply print them out as you compute them.
    * */

    private Problem18 problem;

    @Before
    public void setUp() {
        problem = new Problem18();
    }

    @Test
    public void Test01(){
        List<Integer> array01 = List.of(10, 5,2);
        int expected01 = 10;

        assertEquals(expected01, problem.solution(array01, 3));

        List<Integer> array02 = List.of(5, 2, 7);
        int expected02 = 7;

        assertEquals(expected02, problem.solution(array02, 3));

        List<Integer> array03 = List.of(2, 7, 8);
        int expected03 = 8;

        assertEquals(expected03, problem.solution(array03, 3));

        List<Integer> array04 = List.of(7, 8, 7);
        int expected04 = 8;

        assertEquals(expected04, problem.solution(array04, 3));
    }
}
