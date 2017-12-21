package ap1.task07;

/*

Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given
length are omitted. See wordsWithout() below which is more difficult because it uses arrays.



 */


import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List wordsWithoutList(String[] words, int len) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) list.add(words[i]);
        }
        return list;
    }


}
