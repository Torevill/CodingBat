package array2.task12;

/*

Given a number n, create and return a new string array of length n,
containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array.
Note: String.valueOf(xxx) will make the String form of most types.
The syntax to make a new string array is: new String[desired_length]  (See also: FizzBuzz Code)



 */


public class Solution {
    public String[] fizzArray2(int n) {
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = "" + i;
        }
        return s;
    }


}
