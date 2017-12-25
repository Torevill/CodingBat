package recursion1.task23;

/*

Given a string, compute recursively (no loops) the number of "11" substrings in the string.
The "11" substrings should not overlap.



 */


public class Solution {

    public int count11(String str) {
        if (str.length() == 0) return 0;
        if (str.length() == 1) return 0;
        else if (str.charAt(0) == '1' && str.charAt(1) == '1') return 1 + count11(str.substring(2));
        else return count11(str.substring(1));
    }

}
