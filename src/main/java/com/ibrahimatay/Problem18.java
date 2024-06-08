package com.ibrahimatay;

import java.util.ArrayList;
import java.util.List;

public class Problem18 {

    /*
    Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

    For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:
    ```
    10 = max(10, 5, 2)
    7 = max(5, 2, 7)
    8 = max(2, 7, 8)
    8 = max(7, 8, 7)
    ```
    Do this in O(n) time and O(k) space. You can modify the input array in-place and you do not need to store the results. You can simply print them out as you compute them.
    * */

    public int solution(List<Integer> array, int k){

        int size = array.size();
        int maxCurrentValue = 0;
        List<Integer> maxValues = new ArrayList<>();

        for (int i =0;i<=size-k;i++){
            maxCurrentValue = array.get(i);

            for (int j = 1; j < k; j++) {
                if(array.get(i+j)> maxCurrentValue){
                    maxCurrentValue = array.get(i+j);
                }
            }

            maxValues.add(maxCurrentValue);
        }

        return maxValues.get(0);
    }
}
