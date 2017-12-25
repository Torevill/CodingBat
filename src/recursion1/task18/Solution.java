package recursion1.task18;

/*

Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".



 */


public class Solution {

    public String allStar(String str) {
        if (str.length() == 0) return str;
        else if (str.length() == 1) return str;
        else return str.charAt(0) + "*" + allStar(str.substring(1));
    }

}
