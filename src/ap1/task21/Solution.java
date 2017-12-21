package ap1.task21;

/*

Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
Return the count of the number of strings which appear in both arrays.
The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that
they are in alphabetical order.



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        //sol.commonTwo(new String[]{"a", "b", "c", "c", "d"}, new String[]{"a", "b", "b", "c", "d", "d"});// 4
        System.out.println(sol.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}));//3

    }

    public int commonTwo(String[] a, String[] b) {
        int counter = 0;
        for (int i = 0, j = 0; i < a.length && j < b.length; ) {
            if (a[i].equals(b[j])) {
                counter++;
                String temp = a[i];
                for (int k = 0; i < a.length; k++) {
                    i++;
                    if (i == a.length || !a[i].equals(temp)) break;
                }
                for (int k = 0; j < b.length; k++) {
                    j++;
                    if (j == b.length || !b[j].equals(temp)) break;
                }

            } else {
                if (a[i].compareTo(b[j]) > 0) j++;
                else i++;
            }
        }
        return counter;
    }


}
