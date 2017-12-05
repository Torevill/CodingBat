package logic2.task02;

/*


Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
it does not count towards the sum.

 */


public class Solution {

    public int loneSum(int a, int b, int c) {
        if (a == b) {
            if (a == c) return 0;
            return c;
        } else if (a == c) return b;
        else if (b == c) return a;
        else return a + b + c;
    }


}
