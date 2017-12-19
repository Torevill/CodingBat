package array2.task15;

/*

Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.



 */


public class Solution {

    public boolean either24(int[] nums) {
        boolean is2 = false;
        boolean is4 = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i - 1] == 2) is2 = true;
            else if (nums[i] == 4 && nums[i - 1] == 4) is4 = true;
        }
        return (is2 && !is4) || (is4 && !is2);
    }

}
