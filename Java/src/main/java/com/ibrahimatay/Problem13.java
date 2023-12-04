package com.ibrahimatay;

import java.util.HashSet;
import java.util.Set;

public class Problem13 {

    /*
    * Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.
      For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb", so your function should return 3.
    * */

    public int solution(String s, int k){
        if(s.isEmpty() || k == 0){
            return 0;
        }

        int max = 0;
        String maxLengthString = null;
        StringBuilder builder = new StringBuilder();
        Set<Character> characterSet = new HashSet<>();

        for (int i=0;i<s.length();i++){
            Character character = s.charAt(i);
            if (characterSet.size() == k && !characterSet.contains(character)){
                builder = new StringBuilder(builder.substring(builder.lastIndexOf(Character.toString(builder.charAt(0))) + 1));
                characterSet.clear();
                for (int j=0;j< builder.length();j++){
                    characterSet.add(builder.charAt(j));
                }
            }

            characterSet.add(character);
            builder.append(character);

            if (builder.length()>max){
                max = builder.length();
                maxLengthString = builder.toString();
            }
        }

        System.out.println(maxLengthString);

        return max;
    }
}
