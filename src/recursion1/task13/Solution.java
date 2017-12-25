package recursion1.task13;

/*

Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".



 */


public class Solution {

    public String changePi(String str) {
        if (str.length() == 0) return str;
        else if (str.startsWith("pi")) return "3.14" + changePi(str.substring(2));
        else return str.charAt(0) + changePi(str.substring(1));
    }


}
