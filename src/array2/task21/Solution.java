package array2.task21;

/*

Given an array of ints, return true if every 2 that appears in the array is next to another 2.



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.twoTwo(new int[]{2, 2, 2}));
        System.out.println(sol.twoTwo(new int[]{4, 2, 2, 2}));
    }

    public boolean twoTwo(int[] nums) {
        if (nums.length == 2) return nums[0] == 2 && nums[1] == 2;
        if (nums.length == 1) return !(nums[0] == 2);
        if (nums.length == 0) return true;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == 2 && !(nums[i + 1] == 2 || nums[i - 1] == 2)) return false;
        }
        if (nums[nums.length - 1] == 2 && nums[nums.length - 2] != 2) return false;
        return true;
    }

}
