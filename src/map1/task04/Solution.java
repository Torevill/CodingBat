package map1.task04;

/*

Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present,
 set its value to "cherry". In all cases, set the key "bread" to have the value "butter".

 */


import java.util.Map;

public class Solution {

    public Map<String, String> topping1(Map<String, String> map) {
        if (map.get("ice cream") != null) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }


}
