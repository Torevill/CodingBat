package recursion1.task25;

/*

Given a string, compute recursively the number of times lowercase "hi" appears in the string,
however do not count "hi" that have an 'x' immedately before them.



 */


public class Solution {
    public int countHi2(String str) {
        if (str.length() == 0) return 0;
        else if (str.length() == 1) return 0;
        else if (str.charAt(0) == 'x' && str.charAt(1) == 'x') return countHi2(str.substring(1));
        else if (str.charAt(0) == 'x') return countHi2(str.substring(2));
        else if (str.substring(0).startsWith("hi")) return 1 + countHi2(str.substring(2));
        else return countHi2(str.substring(1));
    }


}
