package warmup1.task02;
/*Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.
 */
public class Solution {
    public int diff21(int n) {
        if (n > 21) return (n-21)*2;
        else return 21-n;
    }
}
