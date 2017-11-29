package string1.task05;

/*


Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

 */


public class Solution {

    public String extraEnd(String str) {
        return str.substring(str.length() - 2, str.length()) +
                str.substring(str.length() - 2, str.length()) +
                str.substring(str.length() - 2, str.length());
    }


}
