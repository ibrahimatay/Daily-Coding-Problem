package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

public class Problem10Test {
       /*
    * This problem was asked by Apple.

    Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.
    * */

    private Problem10 problem;

    @Before
    public void setUp() {
        problem = new Problem10();
    }

    @Test(expected = IllegalArgumentException.class)
    public void schedulerDelayNegative() throws InterruptedException {
        Runnable sayHello = new SayHello();

        problem.scheduler(sayHello, -1);
    }


    @Test
    public void schedulerDelay100() throws InterruptedException {
        Runnable sayHello = new SayHello();

        problem.scheduler(sayHello, 100);
    }

    public class SayHello implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello");
        }
    }
}


