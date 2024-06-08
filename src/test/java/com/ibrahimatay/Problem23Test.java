package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem23Test {
    /*
    You are given an M by N matrix consisting of booleans that represents a board.
    Each True boolean represents a wall. Each False boolean represents a tile you
    can walk on.

    Given this matrix, a start coordinate, and an end coordinate, return the minimum
    number of steps required to reach the end coordinate from the start. If there is
    no possible path, then return null. You can move up, left, down, and right. You
    cannot move through walls. You cannot wrap around the edges of the board.

    For example, given the following board:
    ```
    [[f, f, f, f],
    [t, t, f, t],
    [f, f, f, f],
    [f, f, f, f]]
    ```
    and start = (3, 0) (bottom left) and end = (0, 0) (top left), the minimum number
    of steps required to reach the end is 7, since we would need to go through (1, 2)
    because there is a wall everywhere else on the second row.
    * */
    private Problem23 problem;

    @Before
    public void setUp() {
        problem = new Problem23();
    }

    @Test
    public void Test01() {
        boolean[][] matrix = {
                {false, false, false, false},
                {true, true, false, true},
                {false, false, false, false},
                {false, false, false, false}
        };

        int[] start = {3, 0};
        int[] end = {0, 0};

        assertEquals(7, problem.solution(matrix, start, end));
    }
}
