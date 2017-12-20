package array3.task07;

/*


Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
(spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n,
which is known to sum to exactly n*(n + 1)/2.

 */


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.seriesUp(4)));
    }

    public int[] seriesUp(int n) {
        int[] a = new int[n * (n + 1) / 2];
        int k = 1;
        int x = 1;
        for (int i = 0; i < a.length; ) {
            for (int j = i; j < k + i; j++) {
                a[j] = x++;
            }
            x = 1;
            i += k;
            k++;
        }
        return a;

    }

}
