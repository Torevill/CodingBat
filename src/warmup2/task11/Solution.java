package warmup2.task11;
/*Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.*/

public class Solution {
    public int stringMatch(String a, String b) {
        int counnter = 0;
        StringBuilder a1 = new StringBuilder(a);
        StringBuilder b1 = new StringBuilder(b);
        for (int i = 1; i < a.length() && i < b.length(); i++) {
            if (a1.charAt(i) == b1.charAt(i) && a1.charAt(i - 1) == b1.charAt(i - 1)) {
                counnter++;
            }
        }
        return counnter;
    }
}
