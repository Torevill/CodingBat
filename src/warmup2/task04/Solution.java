package warmup2.task04;
/*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 */

public class Solution {
    boolean doubleX(String str) {
        return (str.indexOf("xx") != -1) && (str.indexOf("xx") == str.indexOf("x"));
    }

}
