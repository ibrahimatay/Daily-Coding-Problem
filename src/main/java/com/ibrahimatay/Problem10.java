package com.ibrahimatay;

public class Problem10 {
    /*
    * This problem was asked by Apple.

    Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.
    * */

    public void scheduler(Runnable f, long n) throws InterruptedException {
        Thread.sleep(n);

        f.run();
    }
}
