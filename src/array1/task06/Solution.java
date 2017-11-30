package array1.task06;

/*


Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

 */


public class Solution {

    public int[] rotateLeft3(int[] nums) {
        int[] r = {nums[1], nums[2], nums[0]};
        return r;
    }


}
