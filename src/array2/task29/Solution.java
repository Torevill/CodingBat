package array2.task29;

/*

We'll say that an element in an array is "alone" if there are values before and after it,
and those values are different from it. Return a version of the given array where every instance
of the given value which is alone is replaced by whichever value to its left or right is larger.



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2);
    }

    public int[] notAlone(int[] nums, int val) {
        if (nums.length <= 2) return nums;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && !(nums[i - 1] == val || nums[i + 1] == val)) {
                nums[i] = nums[i - 1] > nums[i + 1] ? nums[i - 1] : nums[i + 1];
            }
        }

        return nums;

    }


}
