package recursion1.task16;

/*

Given an array of ints, compute recursively the number of times that the
value 11 appears in the array. We'll use the convention of considering only the part of the array
that begins at the given index. In this way, a recursive call can pass index+1 to move down the array.
The initial call will pass in index as 0.



 */


public class Solution {

    public int array11(int[] nums, int index) {
        if (index == nums.length) return 0;
        else if (nums[index] == 11) return array11(nums, index + 1) + 1;
        else return array11(nums, index + 1);
    }


}
