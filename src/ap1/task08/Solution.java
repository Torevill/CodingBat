package ap1.task08;

/*

Given a positive int n, return true if it contains a 1 digit.
Note: use % to get the rightmost digit, and / to discard the rightmost digit.



 */


public class Solution {

    public boolean hasOne(int n) {
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') return true;
        }
        return false;
    }

}
