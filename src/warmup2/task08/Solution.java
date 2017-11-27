package warmup2.task08;

/*Given an array of ints, return the number of 9's in the array.

*/

public class Solution {
    public int arrayCount9(int[] nums) {
        int answ = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) answ++;
        }
        return answ;
    }

}
