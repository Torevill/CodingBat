package array2.task20;

/*

Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.



 */


public class Solution {

    public boolean haveThree(int[] nums) {
        int counter = 0;
        boolean no3Pairs = true;
        if (nums.length >= 1 && nums[0] == 3) counter++;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 3) counter++;
            if (nums[i] == 3 && nums[i - 1] == 3) no3Pairs = false;
        }
        return no3Pairs && counter == 3;
    }

}
