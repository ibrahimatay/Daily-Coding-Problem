package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Problem14Test {

    /*
    The area of a circle is defined as πr2. Estimate π to 3 decimal places using a Monte Carlo method.
    Hint: The basic equation of a circle is x2 + y2 = r2.
    * */

    private Problem14 problem;

    @Before
    public void setUp() {
        problem = new Problem14();
    }

    @Test
    public void Test01(){

        var result01 = problem.solution(1);
        var result02 = problem.solution(1);

        assertTrue(result01 >3);
        assertTrue(result02 >3);
    }
}
