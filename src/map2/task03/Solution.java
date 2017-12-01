package map2.task03;

/*


Given an array of non-empty strings, create and return a Map<String, String> as follows:
for each string add its first character as a key with its last character as the value.

 */


import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String now : strings) {
            map.put(now.substring(0, 1), now.substring(now.length() - 1));
        }
        return map;
    }


}
