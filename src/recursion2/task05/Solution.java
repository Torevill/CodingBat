package recursion2.task05;

/*

Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target,
with this additional constraint: if there are numbers in the array that are adjacent and the identical value,
they must either all be chosen, or none of them chosen. For example, with the array {1, 2, 2, 2, 5, 2},
either all three 2's in the middle must be chosen or not, all as a group.
(one loop can be used to find the extent of the identical values).



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14));
    }

    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        else if (start + 1 < nums.length && nums[start + 1] == nums[start]) {
            int number = 1;
            int sum = nums[start];
            for (int i = start + 1; i < nums.length; i++) {
                if (nums[i] == nums[start]) {
                    sum += nums[i];
                    number++;
                }
            }

            if (groupSumClump(start + number, nums, target)) return true;
            else if (groupSumClump(start + number, nums, target - sum)) return true;
            else return false;
        } else if (groupSumClump(start + 1, nums, target)) return true;
        else if (groupSumClump(start + 1, nums, target - nums[start])) return true;
        else return false;

    }

}
