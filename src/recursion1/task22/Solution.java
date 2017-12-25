package recursion1.task22;

/*

Count recursively the total number of "abc" and "aba" substrings that appear in the given string.



 */


public class Solution {
    public int countAbc(String str) {
        if (str.length() == 0) return 0;
        else if (str.length() == 1) return 0;
        else if (str.length() == 2) return 0;
        else if (str.charAt(0) == 'a' && str.charAt(1) == 'b'
                && (str.charAt(2) == 'a' || str.charAt(2) == 'c')) return 1 + countAbc(str.substring(1));
        else return countAbc(str.substring(1));
    }


}
