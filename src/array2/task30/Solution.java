package array2.task30;

/*

Return an array that contains the exact same numbers as the given array,
but rearranged so that all the zeros are grouped at the start of the array.
The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
You may modify and return the given array or make a new array.



 */


public class Solution {

    public int[] zeroFront(int[] nums) {
        //buble power!
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < nums.length; i++) {
                if (Math.abs(nums[i]) < Math.abs(nums[i - 1])) {
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
