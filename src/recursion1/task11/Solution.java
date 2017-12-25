package recursion1.task11;

/*

Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.



 */


public class Solution {

    public int countHi(String str) {
        if (str.length() == 0) return 0;
        else if (str.startsWith("hi")) return 1 + countHi(str.substring(2));
        else return countHi(str.substring(1));
    }


}
