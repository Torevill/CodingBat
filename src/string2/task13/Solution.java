package string2.task13;

/*


Given a string, consider the prefix string made of the first N chars of the string.
Does that prefix string appear somewhere else in the string? Assume that the string is not
empty and that N is in the range 1..str.length().

 */


public class Solution {

    public boolean prefixAgain(String str, int n) {
        return str.lastIndexOf(str.substring(0, n)) != 0;
    }

}
