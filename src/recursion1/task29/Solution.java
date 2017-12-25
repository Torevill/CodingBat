package recursion1.task29;

/*

Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear
in the string somewhere, possibly with overlapping. N will be non-negative.



 */


public class Solution {

    public boolean strCopies(String str, String sub, int n) {
        if (n == 0) return true;
        else if (str.length() < sub.length()) return false;
        else if (str.startsWith(sub)) return strCopies(str.substring(1), sub, n - 1);
        else return strCopies(str.substring(1), sub, n);
    }


}
