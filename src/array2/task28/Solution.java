package array2.task28;

/*

Given a non-empty array of ints, return a new array containing the elements from the original
array that come after the last 4 in the original array. The original array will contain at least one 4.
Note that it is valid in java to create an array of length 0.



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.post4(new int[]{4, 4, 1, 2, 3});
    }

    public int[] post4(int[] nums) {

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) temp = i;
        }
        int[] a = new int[nums.length - temp - 1];
        for (int i = 0; i < a.length; i++) {
            a[i] = nums[temp + 1 + i];
        }
        return a;

    }

}
