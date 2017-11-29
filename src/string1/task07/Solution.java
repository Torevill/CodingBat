package string1.task07;

/*

Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

 */


public class Solution {

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }


}
