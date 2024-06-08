package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem21Test {
    /**
     * Given an array of time intervals (start, end) for classroom lectures (possibly overlapping),
     * find the minimum number of rooms required.
     * For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.
     * */

    private Problem21 problem;

    @Before
    public void setUp() {
        problem = new Problem21();
    }

    @Test
    public void Test01() {
        int[][] intervals = new int[][] {{30, 75}, {0, 50}, {60, 150}};
        int expected = 2;

        assertEquals(expected, problem.solution((intervals)));
    }

    @Test
    public void Test02() {
        int[][] intervals = new int[][] {{5, 7}, {0, 9}, {5, 9}};
        int expected = 3;

        assertEquals(expected, problem.solution((intervals)));
    }

    @Test
    public void Test03() {
        int[][] intervals = new int[][] {{0, 50}, {30, 75}, {60, 150}};
        int expected = 2;

        assertEquals(expected, problem.solution((intervals)));
    }

    @Test
    public void Test04() {
        int[][] intervals = new int[][] {{0, 120}, {30, 75}, {75, 80}};
        int expected = 2;

        assertEquals(expected, problem.solution((intervals)));
    }
}
