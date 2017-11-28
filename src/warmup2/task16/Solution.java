package warmup2.task16;

/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5,
followed by the value minus 1.
Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.*/

public class Solution {
    public boolean has271(int[] nums) {
        if (nums.length < 3) return false;
        for (int i = 2; i < nums.length; i++) {
            if ((nums[i] >= nums[i - 2] - 3 && nums[i] <= nums[i - 2] + 1) && nums[i - 1] == nums[i - 2] + 5)
                return true;
        }
        return false;
    }
}
