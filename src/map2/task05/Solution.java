package map2.task05;

/*

Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
with the value of all the strings starting with that character appended together in the order they appear in the array.

 */


import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String now : strings) {
            map.merge(now.substring(0, 1), now, String::concat);
        }
        return map;
    }


}
