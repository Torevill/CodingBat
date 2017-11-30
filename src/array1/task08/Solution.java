package array1.task08;

/*


Given an array of ints length 3, figure out which is larger, the first or last element in the array,
and set all the other elements to be that value. Return the changed array.

 */


public class Solution {

    public int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[nums.length - 1]) {
            for (int i = 1; i < nums.length; i++) {
                nums[i] = nums[0];
            }
        } else
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[nums.length - 1];
            }
        return nums;
    }


}
