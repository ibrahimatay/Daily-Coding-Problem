package com.ibrahimatay;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem22 {
    /*
    Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list.
    If there is more than one possible reconstruction, return any of them.
    If there is no possible reconstruction, then return null.

    For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].

    Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].
    * */

    public boolean solution(String word, List<String> words) {
        Set<String> wordSet = new HashSet<>(words);
        boolean[] stateArray = new boolean[word.length()+1];
        stateArray[0] = true;

        for (int i = 1; i <= word.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (stateArray[j] && wordSet.contains(word.substring(j, i))) {
                    stateArray[i] = true;
                    break;
                }
            }
        }

        return stateArray[word.length()];
    }
}
