package warmup1.task17;
/*Given 2 int values, return true if either of them is in the range 10..20 inclusive.*/

public class Solution {
    public boolean in1020(int a, int b) {
        return (a <= 20 && a >= 10) || (b <= 20 && b >= 10) ;
    }
}
