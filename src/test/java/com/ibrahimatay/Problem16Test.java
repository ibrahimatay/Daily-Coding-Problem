package com.ibrahimatay;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem16Test {

    /*
    You run an e-commerce website and want to record the last N order ids in a log.
    Implement a data structure to accomplish this, with the following API:

    record(order_id): adds the order_id to the
    log get_last(i): gets the ith last element from the log.

    i is guaranteed to be smaller than or equal to N.
    You should be as efficient with time and space as possible.
    * */

    private Problem16 problem;

    @Test
    public void Test01() throws Exception {
        problem = new Problem16(6);
        problem.record(1);
        problem.record(2);
        problem.record(3);
        problem.record(4);
        problem.record(5);
        problem.record(6);

        assertEquals(6,problem.getLast(1));
        assertEquals(5,problem.getLast(2));
        assertEquals(4,problem.getLast(3));
        assertEquals(3,problem.getLast(4));
        assertEquals(2,problem.getLast(5));
        assertEquals(1,problem.getLast(6));
    }

    @Test(expected = Exception.class)
    public void maxSizeCheck() throws Exception {
        problem = new Problem16(0);
    }

    @Test(expected = Exception.class)
    public void getLastArgumentBiggerThanToMaxSize() throws Exception {
        problem = new Problem16(2);
        problem.record(1);
        problem.record(2);

        problem.getLast(3);
    }
}
