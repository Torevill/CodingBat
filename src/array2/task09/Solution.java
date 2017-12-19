package array2.task09;

/*

Given an array of ints, return true if the number of 1's is greater than the number of 4's



 */


public class Solution {

    public boolean more14(int[] nums) {
        int oneCount = 0;
        int fourCOunt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) oneCount++;
            else if (nums[i] == 4) fourCOunt++;
        }
        return oneCount == fourCOunt;
    }

}
