package array1.task24;

/*

Given an int array of any length, return a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.

 */


public class Solution {

    public int[] frontPiece(int[] nums) {
        if (nums.length <= 2) return nums;
        int[] a = new int[2];
        for (int i = 0; i < 2; i++) {
            a[i] = nums[i];
        }
        return a;

    }


}
