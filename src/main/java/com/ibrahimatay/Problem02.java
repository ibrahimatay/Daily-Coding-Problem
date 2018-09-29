package com.ibrahimatay;

public class Problem02 {

    /*
    *
    This problem was asked by Uber.

    Given an array of integers, return a new array such that each element at index i of
    the new array is the product of all the numbers in the original array except the one at i.

    For example,
    if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
    If our input was [3, 2, 1], the expected output would be [2, 3, 6].
    */
    public int[] solution(int[] numbers){

        int[] product = new int[numbers.length];

        for (int i = 0; i < product.length; i++) {
            product[i]=1;
        }

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i]==numbers[j]) continue;

                product[i]*=numbers[j];
            }
        }

        return product;
    }
}
