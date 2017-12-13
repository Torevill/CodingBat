package string2.task01;

/*

Given a string, return a string where for every char in the original, there are two chars.

 */


public class Solution {

    public String doubleChar(String str) {
        String answ = "";
        for (int i = 0; i < str.length(); i++) {
            answ = answ + str.charAt(i) + str.charAt(i);
        }
        return answ;
    }

}
