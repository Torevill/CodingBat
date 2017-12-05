package logic2.task09;

/*

We want make a package of goal kilos of chocolate. We have small bars (1 kilo each)
and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars.
Return -1 if it can't be done.

 */


public class Solution {

    public int makeChocolate(int small, int big, int goal) {
        if (big <= goal / 5 && (5 * big + small >= goal)) return goal - 5 * big;
        else if (big > goal / 5 && goal % 5 <= small) return goal - goal % 5;
        else return -1;
    }


}
