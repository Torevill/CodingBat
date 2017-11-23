package warmup1.task28;
/*Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
Note that the % "mod" operator computes remainders, so 17 % 10 is 7*/
public class Solution {
    public boolean lastDigit(int a, int b) {
        while(true){
            a %= 10;
            if (a < 10) break;
        }
        while(true){
            b %= 10;
            if (b < 10) break;
        }
        return a==b;
    }
}
