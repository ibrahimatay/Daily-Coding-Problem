package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem09Test {
    /*
    * This problem was asked by Airbnb.

    Given a list of integers, write a function that returns the largest sum of non-adjacent numbers.
    Numbers can be 0 or negative.

    For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5]
    should return 10, since we pick 5 and 5.

    Follow-up: Can you do this in O(N) time and constant space?
    */

    private Problem09 problem;

    @Before
    public void setUp() {
        problem = new Problem09();
    }

    @Test
    public void shouldBeReturn0(){
        int[] array = {};

        assertEquals(0, problem.solution(array));
    }

    @Test
    public void shouldBeReturn13(){
        int[] array = {2, 4, 6, 2, 5};

        assertEquals(13, problem.solution(array));
    }

    @Test
    public void shouldBeReturn20(){
        int[] array = {1,20,3};

        assertEquals(20, problem.solution(array));
    }

    @Test
    public void shouldBeReturn110(){
        int[] array = {5, 5, 10, 100, 10, 5};

        assertEquals(110, problem.solution(array));
    }
}
