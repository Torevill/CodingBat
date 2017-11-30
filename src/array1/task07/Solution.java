package array1.task07;

/*


Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

 */


public class Solution {

    public int[] reverse3(int[] nums) {
        int[] a = new int[nums.length];
        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            a[j++] = nums[i];
        }
        return a;
    }

}
