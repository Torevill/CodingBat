package string2.task10;

/*

Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.



 */


public class Solution {

    public String repeatEnd(String str, int n) {
        String answ = "";
        for (int i = 0; i < n; i++) {
            answ += str.substring(str.length() - n + 1);
        }
        return answ;
    }

}
