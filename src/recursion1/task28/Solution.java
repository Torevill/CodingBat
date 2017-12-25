package recursion1.task28;

/*

Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string,
without the sub strings overlapping.



 */


public class Solution {

    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        else if (str.startsWith(sub)) return 1 + strCount(str.substring(sub.length()), sub);
        else return strCount(str.substring(1), sub);
    }

}
