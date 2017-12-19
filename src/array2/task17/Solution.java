package array2.task17;

/*

Given an array of ints, return true if the array contains two 7's next to each other,
or there are two 7's separated by one element, such as with {7, 1, 7}.



 */


public class Solution {

    public boolean has77(int[] nums) {
        if (nums.length >= 2 && nums[0] == 7 && nums[1] == 7) return true;
        for (int i = 2; i < nums.length; i++) {
            if ((nums[i] == 7 && nums[i - 1] == 7) || (nums[i] == 7 && nums[i - 2] == 7)) return true;
        }
        return false;
    }

}
