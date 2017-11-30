package array1.task22;

/*


Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
The array length will be at least 3.

 */


public class Solution {

    public int[] midThree(int[] nums) {

        int[] a = {nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};
        return a;
    }
}
