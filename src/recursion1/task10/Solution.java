package recursion1.task10;

/*

Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.



 */


public class Solution {

    public int countX(String str) {
        if (str.length() == 0) return 0;
        else if (str.startsWith("x")) return 1 + countX(str.substring(1));
        else return countX(str.substring(1));
    }

}
