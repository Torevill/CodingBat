package array1.task11;

/*

Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
The original array will be length 1 or more.

 */


public class Solution {

    public int[] makeEnds(int[] nums) {
        int a[] = {nums[0], nums[nums.length - 1]};
        return a;
    }

}
