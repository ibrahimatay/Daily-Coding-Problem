package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem19Test {

    /*
    A builder is looking to build a row of N houses that can be of K different colors.
    He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

    Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color, return the minimum cost which achieves this goal.
    */

    private Problem19 problem;

    @Before
    public void setUp() {
        problem = new Problem19();
    }

    @Test
    public void Test01(){
        assertEquals(16, problem.solution(2,4));
        assertEquals(6, problem.solution(3,2));
    }
}
