package recursion2.task08;

/*

Given an array of ints, is it possible to divide the ints into two groups,
so that the sum of the two groups is the same, with these constraints: all the values that are
multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5)
 must be in the other. (No loops needed.)



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.split53(new int[]{3, 3, 5, 1}));
    }

    public boolean split53(int[] nums) {
        return split53Helper(0, nums, 0, 0);
    }

    public boolean split53Helper(int start, int[] nums, int group1, int group2) {
        if (start >= nums.length) return group1 == group2;
        else if (nums[start] % 5 == 0) return split53Helper(start + 1, nums, group1 + nums[start], group2);
        else if (nums[start] % 3 == 0) return split53Helper(start + 1, nums, group1, group2 + nums[start]);
        else if (split53Helper(start + 1, nums, group1 + nums[start], group2)) return true;
        else if (split53Helper(start + 1, nums, group1, group2 + nums[start])) return true;
        else return false;
    }


}
