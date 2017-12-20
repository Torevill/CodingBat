package array3.task04;

/*

Given a non-empty array, return true if there is a place to split the array so that the
sum of the numbers on one side is equal to the sum of the numbers on the other side.



 */


public class Solution {

    public boolean canBalance(int[] nums) {
        if (nums.length <= 1) return false;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) return false;
        int halfSum = sum / 2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if (sum == halfSum) return true;
        }
        return false;
    }


}
