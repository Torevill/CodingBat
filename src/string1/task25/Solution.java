package string1.task25;

/*


Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

 */


public class Solution {

    public String seeColor(String str) {
        if (str.startsWith("red")) return "red";
        else if (str.startsWith("blue")) return "blue";
        else return "";
    }


}
