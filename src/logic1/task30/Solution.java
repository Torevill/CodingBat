package logic1.task30;

/*

Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
If the sum has more digits than a, just return a without b.
(Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n)
and then check the length of the string.)



 */


public class Solution {

    public int sumLimit(int a, int b) {
        int c = a + b;
        if (Integer.toString(c).length() > Integer.toString(a).length()) return a;
        else return b;
    }

}
