package warmup1.task06;
/*Given two int values, return their sum. Unless the two values are the same, then return double their sum.
*/

public class Solution {
    public int sumDouble(int a, int b) {
        if(a==b) return (a+b)*2;
        return a+b;
    }


}
