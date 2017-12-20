package array3.task08;

/*

We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1}
is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        //System.out.println(sol.maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));//3
        //System.out.println(sol.maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));//2
        System.out.println(sol.maxMirror(new int[]{1, 2, 3, 2, 1}));//5
    }

    public int maxMirror(int[] nums) {
        int counter = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i + counter] == nums[j]) {
                    if (i + counter > nums.length - 2) {
                        counter++;
                        break;
                    } else counter++;
                } else {
                    max = Math.max(counter, max);
                    counter = 0;
                }
            }
            max = Math.max(counter, max);
            counter = 0;
        }
        return max;


    }

}
