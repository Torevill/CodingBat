package warmup1.task24;
/*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
Note that Math.abs(n) returns the absolute value of a number.*/

public class Solution {
    public int close10(int a, int b) {
        if(Math.abs(10-a) == Math.abs(10-b)) return 0;
    return (Math.abs(10-a) < Math.abs(10-b)) ? a : b;
    }
}
