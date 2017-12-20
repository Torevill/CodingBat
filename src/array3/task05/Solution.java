package array3.task05;

/*

Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers
in inner appear in outer. The best solution makes only a single "linear" pass of both arrays,
taking advantage of the fact that both arrays are already in sorted order.



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.linearIn(new int[]{2, 2, 2, 2, 2}, new int[]{2, 4}));
    }


    public boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) return true;
        int j = 0;
        for (int i = 0; i < outer.length; i++) {
            if (outer[i] == inner[j]) {
                j++;
                if (j == inner.length) return true;
            }
        }
        return false;
    }


}
