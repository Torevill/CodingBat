package ap1.task10;

/*

Given an array of positive ints, return a new array of length "count" containing the
first even numbers from the original array. The original array will contain at least "count" even numbers.



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.copyEvens(new int[]{3, 2, 4, 5, 8}, 3);
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] a = new int[count];
        for (int i = 0, j = 0; count > 0; i++) {
            if (nums[i] % 2 == 0) {
                a[j] = nums[i];
                count--;
                j++;
            }
        }
        return a;
    }

}
