package map2.task09;

/*

We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
Loop over and then return the given array of non-empty strings as follows:
if a string matches an earlier string in the array, swap the 2 strings in the array.
A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled.
Using a map, this can be solved making just one pass over the array. More difficult than it looks.

 */


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String[] test = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        firstSwap(test);
        

    }


    public static String[] firstSwap(String[] strings) {
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map1.containsKey(strings[i].charAt(0)) && map1.get(strings[i].charAt(0)) != -1) {
                String temp = strings[map1.get(strings[i].charAt(0))];//in shock myself
                strings[map1.get(strings[i].charAt(0))] = strings[i];
                strings[i] = temp;
                map1.put(strings[i].charAt(0), -1);

            } else if (map1.isEmpty() || !map1.containsKey(strings[i].charAt(0))) {
                map1.put(strings[i].charAt(0), i);
            } else if (map1.get(strings[i].charAt(0)) != -1) {
                map1.put(strings[i].charAt(0), i);
            }
        }
        return strings;
    }

}
