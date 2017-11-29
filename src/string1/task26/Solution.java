package string1.task26;

/*

Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

 */


public class Solution {

    public boolean frontAgain(String str) {
        if (str.length() < 2) return false;
        return str.startsWith(str.substring(str.length() - 2));
    }

}
