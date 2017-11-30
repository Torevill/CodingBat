package array1.task26;

/*

Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
the elements from a followed by the elements from b. The arrays may be any length, including 0,
but there will be 2 or more elements available between the 2 arrays.

 */


public class Solution {

    public int[] make2(int[] a, int[] b) {
        int[] c = new int[2];
        for (int i = 0; i < a.length && i < 2; i++) {
            c[i] = a[i];
        }
        int j = 0;
        for (int i = a.length; i < 2; i++) {
            c[i] = b[j++];
        }
        return c;
    }


}
