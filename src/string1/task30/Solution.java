package string1.task30;

/*

Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and
keep the second char if it is 'b'. The string may be any length. Harder than it looks.

 */


public class Solution {

    public String deFront(String str) {
        if (str.length() <= 1) {
            if (str.length() == 0) return str;
            else if (str.charAt(0) == 'a') return str;
            else return "";
        }

        if (str.startsWith("ab")) return str;
        else if (str.startsWith("a")) return str.substring(0, 1) + str.substring(2);
        else if (str.charAt(1) == 'b') return str.substring(1);
        else return str.substring(2);
    }


}
