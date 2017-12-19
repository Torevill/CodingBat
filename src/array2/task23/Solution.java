package array2.task23;

/*

Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.tripleUp(new int[]{1, 4, 5, 6, 2}));
    }

    public boolean tripleUp(int[] nums) {
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1
                    && nums[i - 1] == nums[i - 2] + 1) return true;
        }
        return false;
    }

}
