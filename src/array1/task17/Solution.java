package array1.task17;

/*


Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

 */


public class Solution {

    public int start1(int[] a, int[] b) {
        int counter = 0;
        if (a.length > 0 && a[0] == 1) counter++;
        if (b.length > 0 && b[0] == 1) counter++;
        return counter;

    }


}
