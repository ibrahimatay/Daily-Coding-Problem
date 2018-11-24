package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem07Test {

    /*
    * This problem was asked by Facebook.

    Given the mapping a = 1, b = 2, ... z = 26, and an encoded message,
    count the number of ways it can be decoded.

    For example, the message '111' would give 3,
    since it could be decoded as 'aaa', 'ka', and 'ak'.

    You can assume that the messages are decodable.
    For example, '001' is not allowed.
    * */

    private Problem07 problem;

    @Before
    public void setUp() {
        problem = new Problem07();
    }

    @Test
    public void shouldBeInputValue111(){
        assertEquals(3, problem.solution("111"));
    }

    @Test
    public void shouldBeInputValue1234(){
        assertEquals(3, problem.solution("1234"));
    }

    @Test
    public void shouldBeInputValue121(){
        assertEquals(3, problem.solution("121"));
    }

    @Test
    public void shouldBeInputValue12(){
        assertEquals(2, problem.solution("12"));
    }
}
