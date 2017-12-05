package logic2.task08;

/*

Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced, so the difference between small and medium is
the same as the difference between medium and large.

 */


public class Solution {

    public boolean evenlySpaced(int a, int b, int c) {
        return (2 * a == b + c || 2 * b == a + c || 2 * c == a + b);//behold the power of math!
    }
}
