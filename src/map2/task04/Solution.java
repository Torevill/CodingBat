package map2.task04;

/*

The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
with a key for each different string, with the value the number of times that string appears in the array.

 */


import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String now : strings) {
            map.merge(now, 1, Integer::sum);
        }
        return map;
    }


}
