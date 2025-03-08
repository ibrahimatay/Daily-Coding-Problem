package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem25Test {

    /*
    Implement regular expression matching with the following special characters:

    . (period) which matches any single character
    (asterisk) which matches zero or more of the preceding element
    That is, implement a function that takes in a string and a valid regular expression and returns whether or not the string matches the regular expression.

    For example, given the regular expression "ra." and the string "ray", your function should return true. The same regular expression on the string "raymond" should return false.

    Given the regular expression ".*at" and the string "chat", your function should return true. The same regular expression on the string "chats" should return false.

    This problem was asked by Facebook.
    * */

    private Problem25 problem;

    @Before
    public void setUp() {
        problem = new Problem25();
    }

    @Test
    public void testSimpleMatch() {
        assertTrue(problem.solution("ray", "ra."));
    }

    @Test
    public void testNoMatch() {
        assertFalse(problem.solution("raymond", "ra."));
    }

    @Test
    public void testWildcardMatch() {
        assertTrue(problem.solution("chat", ".*at"));
    }

    @Test
    public void testWildcardNoMatch() {
        assertFalse(problem.solution("chats", ".*at"));
    }

    @Test
    public void testComplexPatternNoMatch() {
        assertFalse(problem.solution("mississippi", "mis*is*p*."));
    }

    @Test
    public void testComplexPatternMatch() {
        assertTrue(problem.solution("aab", "c*a*b"));
    }

    @Test
    public void testEmptyStringMatch() {
        assertTrue(problem.solution("", "c*"));
    }

    @Test
    public void testAnyCharacterMatch() {
        assertTrue(problem.solution("abc", ".*"));
    }

    @Test
    public void testRepeatingCharacterMatch() {
        assertTrue(problem.solution("aaa", "a*a"));
    }

    @Test
    public void testNoMatchWithDifferentChar() {
        assertFalse(problem.solution("abcd", "d*"));
    }
}
