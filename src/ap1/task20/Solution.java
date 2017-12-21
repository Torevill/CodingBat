package ap1.task20;

/*

Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
Return a new array containing the first N elements from the two arrays.
The result array should be in alphabetical order and without duplicates.
A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B,
taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3);// ["a", "b", "c"]
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] s = new String[n];
        for (int i = 0, j = 0, k = 0; k < n; ) {
            String temp = a[i].compareTo(b[j]) < 0 ? a[i] : b[j];
            if (temp.equals(a[i])) {
                if (k != 0 && s[k - 1] == temp) {
                    i++;
                } else {
                    s[k++] = temp;
                    i++;
                }

            } else {
                if (k != 0 && s[k - 1] == temp) {
                    j++;
                } else {
                    s[k++] = temp;
                    j++;
                }
            }
        }
        return s;
    }


}
