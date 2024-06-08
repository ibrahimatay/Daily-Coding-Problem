package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem13Test {

    /*
    * Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.
      For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb", so your function should return 3.
    * */

    private Problem13 problem;

    @Before
    public void setUp() {
        problem = new Problem13();
    }

    @Test
    public void Test01(){
        assertEquals(problem.solution("abcba", 2), 3);
    }
}
