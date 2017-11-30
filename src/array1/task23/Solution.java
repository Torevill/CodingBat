package array1.task23;

/*


Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
The array length will be a least 1.

 */


public class Solution {

    public int maxTriple(int[] nums) {

        return Math.max(nums[0], Math.max(nums[nums.length - 1], nums[nums.length / 2]));

    }

}
