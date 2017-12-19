package array2.task25;

/*

Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
You may modify and return the given array, or return a new array.



 */


public class Solution {

    public int[] shiftLeft(int[] nums) {
        if (nums.length <= 1) return nums;
        int end = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        nums[nums.length - 1] = end;
        return nums;
    }

}
