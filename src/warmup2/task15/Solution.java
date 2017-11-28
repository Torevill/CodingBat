package warmup2.task15;
/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
Return true if the array does not contain any triples.


*/

public class Solution {
    public boolean noTriples(int[] nums) {
        if (nums.length < 3) return true;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] && nums[i - 1] == nums[i - 2]) return false;
        }
        return true;
    }
}
