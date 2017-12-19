package array2.task33;

/*

Return an array that contains the exact same numbers as the given array,
but rearranged so that all the even numbers come before all the odd numbers.
Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.



 */


public class Solution {

    public int[] evenOdd(int[] nums) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] % 2 == 0 && nums[i - 1] % 2 != 0) {
                    int temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                    flag = true;
                }
            }
        }
        return nums;
    }


}
