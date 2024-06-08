package com.ibrahimatay;

public class Problem04 {

    /*
    *   This problem was asked by Stripe.

        Given an array of integers, find the first missing positive integer in linear time and constant space.
        In other words, find the lowest positive integer that does not exist in the array.
        The array can contain duplicates and negative numbers as well.

        For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

        You can modify the input array in-place.
    * */

   public int solution(int[] array){

       for (int i = 0; i < array.length; i++) {
           while (array[i]!=i+1){
               if(array[i]<=0 || array[i] >= array.length || array[i] == array[array[i]-1]){
                    break;
               }

               int swap = array[i];
               array[i] = array[swap-1];
               array[swap-1] = swap;
           }
       }

       for (int i = 0; i < array.length; i++) {
           if (array[i]!=i+1){
               return i+1;
           }
       }

       return array.length+1;
   }
}
