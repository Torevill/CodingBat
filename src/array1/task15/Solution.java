package array1.task15;

/*


Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

 */


public class Solution {

    public boolean double23(int[] nums) {
        if (nums.length < 2) return false;
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] == 2 && nums[i - 1] == 2) || (nums[i] == 3 && nums[i - 1] == 3)) return true;
        }
        return false;
    }

}
