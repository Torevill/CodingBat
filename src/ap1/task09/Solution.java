package ap1.task09;

/*

We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not
divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit,
and / to discard the rightmost digit.



 */


public class Solution {

    public boolean dividesSelf(int n) {
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') return false;
            else if (n % Character.getNumericValue(s.charAt(i)) != 0) return false;
        }
        return true;

    }


}
