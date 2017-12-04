package logic1.task23;

/*

Given three ints, a b c, return true if one of them is 10 or more less than one of the others.



 */


public class Solution {

    public boolean lessBy10(int a, int b, int c) {
        return (a + 10 <= b && a + 10 <= c) || (b + 10 <= a && b + 10 <= c) || (c + 10 <= b && c + 10 <= a);
    }


}
