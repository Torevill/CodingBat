package warmup2.task09;
/*Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
 */

public class Solution {
    public boolean arrayFront9(int[] nums) {
        int n = nums.length <= 4 ? nums.length : 4;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

}
