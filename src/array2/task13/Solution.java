package array2.task13;

/*

Given an array of ints, return true if it contains no 1's or it contains no 4's.



 */


public class Solution {

    public boolean no14(int[] nums) {
        boolean flag1 = false;
        boolean flag4 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) flag1 = true;
            else if (nums[i] == 4) flag4 = true;
        }
        return (!flag1 && flag4) || (flag1 && !flag4) || (!flag1 && !flag4);
    }


}
