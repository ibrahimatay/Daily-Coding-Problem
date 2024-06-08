package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem12Test {

    /*
    * There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time.
    * Given N, write a function that returns the number of unique ways you can climb the staircase.
    * The order of the steps matters. For example, if N is 4, then there are 5 unique ways:

        1, 1, 1, 1
        2, 1, 1
        1, 2, 1
        1, 1, 2
        2, 2
      What if, instead of being able to climb 1 or 2 steps at a time,
      you could climb any number from a set of positive integers X?
      For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.
    *
    *
    * */

    private Problem12 problem;

    @Before
    public void setUp() {
        problem = new Problem12();
    }

    @Test
    public void StepTest01(){
        int[] way01= {1,3,5};
        int n01 = 4;
        assertEquals(3, problem.solution(n01, way01));
    }

    @Test
    public void StepTest02(){
        int[] way = { 1, 2, 3 };
        int n = 4;
        assertEquals(7, problem.solution(n, way));
    }

    @Test
    public void StepTest03(){
        int[] way = { 1, 2, 3 };
        int n = 3;
        assertEquals(4, problem.solution(n, way));
    }
}
