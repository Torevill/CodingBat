package recursion1.task30;

/*

Given a string and a non-empty substring sub, compute recursively the largest substring
which starts and ends with sub and return its length.



 */


public class Solution {

    public int strDist(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        else if (!str.startsWith(sub)) return strDist(str.substring(1), sub);
        else if (str.endsWith(sub)) return str.length();
        else return strDist(str.substring(0, str.length() - 1), sub);
    }

}
