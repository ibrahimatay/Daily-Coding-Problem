package com.ibrahimatay;

public class Problem07 {

    /*
    * This problem was asked by Facebook.

    Given the mapping a = 1, b = 2, ... z = 26, and an encoded message,
    count the number of ways it can be decoded.

    For example, the message '111' would give 3,
    since it could be decoded as 'aaa', 'ka', and 'ak'.

    You can assume that the messages are decodable.
    For example, '001' is not allowed.
    * */


    public int solution(String s){
        return numberDecoder(s.toCharArray(), s.length());
    }

    private int numberDecoder(char[] digits, int length){
        if(length == 0 || length == 1){
            return 1;
        }

        int count = 0;

        if(digits[length-1] > '0'){
            count = numberDecoder(digits, length-1);
        }

        if (digits[length - 2] == '1' ||
                (digits[length - 2] == '2' && digits[length - 1] < '7')) {
            count += numberDecoder(digits, length - 2);
        }

        return count;
    }
}
