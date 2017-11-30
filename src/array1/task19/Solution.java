package array1.task19;

/*


Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
The original array will be length 2 or more.

 */


public class Solution {

    public int[] makeMiddle(int[] nums) {
        int[] a = {nums[nums.length / 2 - 1], nums[nums.length / 2]};
        return a;
    }


}
