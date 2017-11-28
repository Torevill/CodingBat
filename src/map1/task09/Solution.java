package map1.task09;

/*


Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.

 */


import java.util.Map;

public class Solution {

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.get("a") == null || map.get("b") == null) return map;

        if (map.get("a").length() == map.get("b").length()) {
            map.put("a", "");
            map.put("b", "");
        } else if (map.get("a").length() >= map.get("b").length()) {
            map.put("c", map.get("a"));
        } else {
            map.put("c", map.get("b"));
        }
        return map;
    }


}
