package warmup2.task10;
/*Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 */

public class Solution {
    public boolean array123(int[] nums) {
        if (nums.length <= 2) return false;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i - 1] == 2 && nums[i - 2] == 1) {
                return true;
            }
        }
        return false;
    }
}
