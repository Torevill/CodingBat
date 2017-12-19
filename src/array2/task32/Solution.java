package array2.task32;

/*

Return a version of the given array where each zero value in the array is replaced by the
largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero,
leave the zero as a zero.



 */


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.zeroMax(new int[]{0, 4, 0, 3})));
        System.out.println(Arrays.toString(sol.zeroMax(new int[]{7, 0, 4, 3, 0, 2})));
    }

    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int max = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 != 0 && nums[j] != 0 && nums[j] > max) {
                        max = nums[j];
                    }
                }
                nums[i] = max;
            }
        }
        return nums;
    }


}
