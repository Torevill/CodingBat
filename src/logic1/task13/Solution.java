package logic1.task13;

/*

Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b)
is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod



 */


public class Solution {

    public boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }


}
