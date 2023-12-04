package com.ibrahimatay;

import org.junit.*;

import static org.junit.Assert.*;

public class Problem05Test {

    /*
        This problem was asked by Jane Street.

        cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns
        the first and last element of that pair. For example, car(cons(3, 4)) returns 3,
        and cdr(cons(3, 4)) returns 4.

        Given this implementation of cons:

        def cons(a, b):
            def pair(f):
                return f(a, b)
            return pair
        Implement car and cdr.
    * */

    private Problem05 problem;

    @Before
    public void setUp() {
        problem = new Problem05();
    }

    @Test
    public void getFirstElementForExpected3(){

        int a = 3;
        int b = 4;

        int expected = 3;

        int result = problem.car(problem.cons(a,b));

        assertEquals(expected, result);
    }

    @Test
    public void getFirstElementForExpected2(){

        int a = 2;
        int b = 9;

        int expected = 2;

        int result = problem.car(problem.cons(a,b));

        assertEquals(expected, result);
    }

    @Test
    public void getLastElementForExpected4(){

        int a = 3;
        int b = 4;

        int expected = 4;

        int result = problem.cdr(problem.cons(a,b));

        assertEquals(expected, result);
    }

    @Test
    public void getLastElementForExpected6(){

        int a = 1;
        int b = 6;

        int expected = 6;

        int result = problem.cdr(problem.cons(a,b));

        assertEquals(expected, result);
    }
}