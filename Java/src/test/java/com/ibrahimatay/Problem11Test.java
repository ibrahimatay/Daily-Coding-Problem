package com.ibrahimatay;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Problem11Test {

    /*
    * Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.

      For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].

      Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.
    * */

    private Problem11 problem;

    @Before
    public void setUp() {
        problem = new Problem11();
        problem.add("dog");
        problem.add("deer");
        problem.add("deal");
    }

    @Test
    public void autocomplete(){
        assertEquals(2,problem.getFoundWord("de").size());
        assertEquals(3,problem.getFoundWord("d").size());
    }
}
