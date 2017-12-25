package recursion1.task14;

/*

Given a string, compute recursively a new string where all the 'x' chars have been removed.



 */


public class Solution {

    public String noX(String str) {
        if (str.length() == 0) return str;
        else if (str.startsWith("x")) return noX(str.substring(1));
        else return str.charAt(0) + noX(str.substring(1));
    }

}
