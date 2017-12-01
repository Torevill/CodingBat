package map2.task06;

/*

Loop over the given array of strings to build a result string like this:
when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
Return the empty string if no string appears a 2nd time.

 */


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String[] a = {"a", "b", "a", "c", "a", "d", "a"};
        System.out.println(wordAppend(a));
    }

    public static String wordAppend(String[] strings) {
        String answ = "";
        Map<String, Integer> map = new HashMap<>();
        for (String now : strings) {
            map.merge(now, 1, Integer::sum);
            if (map.get(now) % 2 == 0) answ += now;
        }
        return answ;
    }


}
