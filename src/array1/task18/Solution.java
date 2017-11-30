package array1.task18;

/*

Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
Return the array which has the largest sum. In event of a tie, return a.

 */


public class Solution {

    public int[] biggerTwo(int[] a, int[] b) {
        int suma = 0;
        int sumb = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sumb += b[i];
        }
        return suma >= sumb ? a : b;

    }

}
