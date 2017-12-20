package array3.task06;

/*

Given n>=0, create an array length n*n with the following pattern,
shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).



 */


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.squareUp(5)));
    }

    public int[] squareUp(int n) {
        int[] a = new int[n * n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = ((i + 1) * n) - 1; j >= i * n; j--) {
                if (j >= (((i + 1) * n) - 1) - i) a[j] = k++;
            }
            k = 1;
        }
        return a;
    }
}


