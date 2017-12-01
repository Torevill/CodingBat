package map2.task07;

/*

Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value
is true if that string appears 2 or more times in the array.

 */


import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Integer> map1 = new HashMap<>();
        for (String now : strings) {
            map1.merge(now, 1, Integer::sum);
        }
        Map<String, Boolean> map2 = new HashMap<>();
        for (Map.Entry<String, Integer> now : map1.entrySet()) {
            if (now.getValue() >= 2) {
                map2.put(now.getKey(), true);
            } else {
                map2.put(now.getKey(), false);
            }
        }
        return map2;

    }


}
