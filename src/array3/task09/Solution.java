package array3.task09;

/*

Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
Return the number of clumps in the given array.



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countClumps(new int[]{1, 1, 1, 1, 1}));
    }

    public int countClumps(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; ) {
            if (nums[i] == nums[i + 1]) {
                counter++;
                for (int j = i + 1; j < nums.length; j++) {
                    if (j == nums.length - 1) {
                        i = nums.length;
                        break;
                    }
                    if (nums[j] != nums[i]) {
                        i = j;
                        break;
                    }
                }
            } else i++;
        }
        return counter;
    }


}
