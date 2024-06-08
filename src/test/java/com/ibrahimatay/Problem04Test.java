package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem04Test {

    /*
    *   This problem was asked by Stripe.

        Given an array of integers, find the first missing positive integer in linear time and constant space.
        In other words, find the lowest positive integer that does not exist in the array.
        The array can contain duplicates and negative numbers as well.

        For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

        You can modify the input array in-place.
    * */

    private Problem04 problem;

    @Before
    public void setUp() throws Exception {
        problem = new Problem04();
    }


    @Test
    public void shouldBe2ByInputArrayFirstMissingValue(){
        int[] array = new int[4];

        array[0] = 3;
        array[1] = 4;
        array[2] = -1;
        array[3] = 1;

        int result = problem.solution(array);

        assertEquals(2, result);
    }

    @Test
    public void shouldBe3ByInputArrayFirstMissingValue(){
        int[] array = new int[3];

        array[0] = 1;
        array[1] = 2;
        array[2] = 0;

        int result = problem.solution(array);

        assertEquals(3, result);
    }

    @Test
    public void shouldBe1ByInputArrayFirstMissingValue(){
        int[] array = new int[5];

        array[0] = 7;
        array[1] = 8;
        array[2] = 9;
        array[3] = 11;
        array[4] = 12;

        int result = problem.solution(array);

        assertEquals(1, result);
    }
}