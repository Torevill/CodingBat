package recursion1.task27;

/*

Given a string, return true if it is a nesting of zero or more pairs of parenthesis,
like "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them.



 */


public class Solution {

    public boolean nestParen(String str) {
        if (str.length() == 0) return true;
        else if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
            return nestParen(str.substring(1, str.length() - 1));
        else return false;
    }

}
