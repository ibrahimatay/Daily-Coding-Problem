package com.ibrahimatay;

import org.junit.Before;
import org.junit.Test;

public class Problem15Test {

    /*
    Given a stream of elements too large to store in memory,
    pick a random element from the stream with uniform probability.

    If you liked this problem, feel free to forward it along!

    * */

    private Problem15 problem;

    @Before
    public void setUp() {
        problem = new Problem15();
    }

    @Test
    public void Test01(){
        int numbers[] = {1,2,3,4,5,6,7};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Random number from " +(i+1)+ " number is "+ problem.solution(numbers[i]));
        }
    }
}
