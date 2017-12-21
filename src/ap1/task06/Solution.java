package ap1.task06;

/*

Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.



 */


public class Solution {

    public String[] wordsFront(String[] words, int n) {
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = words[i];
        }
        return s;
    }


}
