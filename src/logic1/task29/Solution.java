package logic1.task29;

/*

Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

 */


public class Solution {

    public boolean shareDigit(int a, int b) {
        return (a % 10 == b % 10 || a % 10 == b / 10) || (a / 10 == b % 10 || a % 10 == b / 10);
    }

}
