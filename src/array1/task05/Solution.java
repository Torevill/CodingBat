package array1.task05;

/*

Given an array of ints length 3, return the sum of all the elements.

 */


public class Solution {

    public int sum3(int[] nums) {
        int sum = 0;
        for (int now : nums) {
            sum += now;
        }
        return sum;
    }


}
