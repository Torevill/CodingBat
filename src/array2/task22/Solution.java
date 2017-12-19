package array2.task22;

/*

Return true if the group of N numbers at the start and end of the array are the same.
For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and
false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.



 */


public class Solution {

    public boolean sameEnds(int[] nums, int len) {
        int[] a = new int[len];
        for (int i = nums.length - len, j = 0; i < nums.length; i++, j++) {
            a[j] = nums[i];
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] != a[i]) return false;
        }
        return true;
    }

}
