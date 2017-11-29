package string1.task33;

/*

Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
 and otherwise return the string unchanged. This is a little harder than it looks.

 */


public class Solution {

    public String withoutX2(String str) {
        if (str.length() == 0) return str;
        if (str.startsWith("xx")) return str.length() == 2 ? "" : str.substring(2);
        else if (str.startsWith("x")) return str.length() == 1 ? "" : str.substring(1);
        else if (str.substring(1).startsWith("x"))
            return str.length() == 2 ? str.substring(0, 1) : str.substring(0, 1) + str.substring(2);
        else return str;
    }


}
