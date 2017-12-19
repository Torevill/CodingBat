package array2.task18;

/*

Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.



 */


public class Solution {

    public boolean has12(int[] nums) {
        boolean flag1 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) flag1 = true;
            else if (nums[i] == 2 && flag1) return true;
        }
        return false;
    }

}
