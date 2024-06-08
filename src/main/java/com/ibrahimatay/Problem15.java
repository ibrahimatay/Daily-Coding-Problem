package com.ibrahimatay;

import java.util.Random;

public class Problem15 {

    /*
    Given a stream of elements too large to store in memory,
    pick a random element from the stream with uniform probability.

    If you liked this problem, feel free to forward it along!

    My resource reference:
    - https://www.geeksforgeeks.org/select-a-random-number-from-stream-with-o1-space/
    - https://en.wikipedia.org/wiki/Reservoir_sampling
    * */

    private static int count = 0;
    private static int currentNumber = 0;

    public int solution(int x){

        count++;

        if(count == 1){
            currentNumber = x;
        }else{
            Random random = new Random();
            int index = random.nextInt(count);

            if(index == (count-1)){
                currentNumber = x;
            }
        }

        return currentNumber;
    }
}
