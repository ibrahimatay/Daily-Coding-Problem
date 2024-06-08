package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem02Test {

    /*
    *
    This problem was asked by Uber.

    Given an array of integers, return a new array such that each element at index i of
    the new array is the product of all the numbers in the original array except the one at i.

    For example,
    if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
    If our input was [3, 2, 1], the expected output would be [2, 3, 6].
    */

    private Problem02 problem;

    @Before
    public void setUp() throws Exception {
        problem = new Problem02();
    }

    @Test
    public void shouldBeTheReturnedArrayForInput1(){
        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=5;

        int[] result = problem.solution(numbers);

        int[] expected = new int[5];

        expected[0] = 120;
        expected[1] = 60;
        expected[2] = 40;
        expected[3] = 30;
        expected[4] = 24;

        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldBeTheReturnedArrayForInput2(){
        int[] numbers = new int[3];
        numbers[0]=3;
        numbers[1]=2;
        numbers[2]=1;

        int[] result = problem.solution(numbers);

        int[] expected = new int[3];

        expected[0] = 2;
        expected[1] = 3;
        expected[2] = 6;

        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldBeTheReturnedArrayForInput3(){
        int[] numbers = new int[6];
        numbers[0]=1;
        numbers[1]=7;
        numbers[2]=3;
        numbers[3]=3;
        numbers[4]=4;
        numbers[5]=4;

        int[] result = problem.solution(numbers);

        int[] expected = new int[6];

        expected[0] = 1008;
        expected[1] = 144;
        expected[2] = 112;
        expected[3] = 112;
        expected[4] = 63;
        expected[5] = 63;

        assertArrayEquals(expected, result);

    }
}