package logic2.task07;

/*

Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

 */


public class Solution {

    public int blackjack(int a, int b) {
        if (21 - a < 0 && 21 - b < 0) return 0;
        else if (21 - a < 0) return b;
        else if (21 - b < 0) return a;
        else return 21 - a > 21 - b ? b : a;
    }

}
