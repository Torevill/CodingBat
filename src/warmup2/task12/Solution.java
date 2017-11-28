package warmup2.task12;
/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
 */

public class Solution {
    public String stringX(String str) {
        if (str.length() <= 2) return str;
        String answ = "" + str.charAt(0);
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') answ += str.charAt(i);
        }
        answ += str.charAt(str.length() - 1);
        return answ;
    }
}
