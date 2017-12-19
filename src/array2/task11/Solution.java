package array2.task11;

/*

Given an array of ints, return true if every element is a 1 or a 4.



 */


public class Solution {

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 4) continue;
            else return false;
        }
        return true;
    }

}
