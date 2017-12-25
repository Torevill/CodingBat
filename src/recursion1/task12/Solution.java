package recursion1.task12;

/*

Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.



 */


public class Solution {

    public String changeXY(String str) {
        if (str.length() == 0) return str;
        else if (str.startsWith("x")) return "y" + changeXY(str.substring(1));
        else return str.charAt(0) + changeXY(str.substring(1));
    }


}
