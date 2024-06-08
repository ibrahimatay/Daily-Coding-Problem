package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Problem01Test {

    /*
    *
    This problem was recently asked by Google.

    Given a list of numbers and a number k, return whether any two numbers
    from the list add up to k.

    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
    */

    private int[] numbers;
    private  Problem01 problem;

    @Before
    public void setUp() throws Exception {
        problem = new Problem01();
        numbers = new int[4];

        numbers[0]=10;
        numbers[1]=15;
        numbers[2]=3;
        numbers[3]=7;
    }

    @Test
    public void shouldBeSuccessfulFor17(){
        int[] expected = new int[2];
        expected[0]=10;
        expected[1]=7;

        assertArrayEquals(expected, problem.solution(numbers, 17));
    }

    @Test
    public void shouldBeSuccessfulFor10(){
        int[] expected = new int[2];
        expected[0]=3;
        expected[1]=7;

        assertArrayEquals(expected, problem.solution(numbers, 10));
    }

    @Test
    public void shouldBeSuccessfulFor18(){
        int[] expected = new int[2];
        expected[0]=15;
        expected[1]=3;

        assertArrayEquals(expected, problem.solution(numbers, 18));
    }
}