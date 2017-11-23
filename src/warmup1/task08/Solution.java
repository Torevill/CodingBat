package warmup1.task08;

/*Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10*/

public class Solution {
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a+b == 10) ? true : false;
    }

}
