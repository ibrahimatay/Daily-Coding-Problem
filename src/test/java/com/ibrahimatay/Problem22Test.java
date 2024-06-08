package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem22Test {
    /*
    Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list.
    If there is more than one possible reconstruction, return any of them.
    If there is no possible reconstruction, then return null.

    For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].

    Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].
    * */

    private Problem22 problem;

    @Before
    public void setUp() {
        problem = new Problem22();
    }

    @Test
    public void Test01() {
        assertEquals(true, problem.solution("leetcode", Arrays.asList("leet","code")));
    }

    @Test
    public void Test02() {
        assertEquals(true, problem.solution("applepenapple", Arrays.asList("apple","pen")));
    }

    @Test
    public void Test03() {
        assertEquals(false, problem.solution("catsandog", Arrays.asList("cats","dog","sand","and","cat")));
    }
}
