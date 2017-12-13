package string2.task08;

/*


We'll say that a String is xy-balanced if for all the 'x' chars in the string,
there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

 */


public class Solution {

    public boolean xyBalance(String str) {
        if (str.indexOf("x") == -1) return true;
        return str.lastIndexOf("y") > str.lastIndexOf("x");
    }


}
