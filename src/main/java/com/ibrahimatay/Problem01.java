package com.ibrahimatay;

public class Problem01 {

    /*
    *
    This problem was recently asked by Google.

    Given a list of numbers and a number k, return whether any two numbers
    from the list add up to k.

    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
    */

    public int[] solution(int[] numbers, int k){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

                if(numbers[i]==numbers[j])continue;

                if((numbers[i]+numbers[j])==k){
                    int[] result = new int[2];
                    result[0]=numbers[i];
                    result[1]=numbers[j];

                    return result;
                }
            }
        }

        return null;
    }
}
