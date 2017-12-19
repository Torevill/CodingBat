package array2.task34;

/*

This is slightly more difficult version of the famous FizzBuzz problem which is sometimes
given as a first problem for job interviews. (See also: FizzBuzz Code.) Consider the series
of numbers beginning at start and running up to but not including end, so for example start=1
and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form
of these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use
"Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the
String form of an int or other type. This version is a little more complicated than the usual version
since you have to allocate and index into an array instead of just printing, and we vary the start/end instead
of just always doing 1..100.



 */


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.fizzBuzz(1, 8)));
    }


    public String[] fizzBuzz(int start, int end) {
        String[] s = new String[end - start];
        for (int i = start, j = 0; i < end; i++, j++) {
            if (i % 3 == 0 && i % 5 == 0) {
                s[j] = "FizzBuzz";
            } else if (i % 3 == 0) {
                s[j] = "Fizz";
            } else if (i % 5 == 0) {
                s[j] = "Buzz";
            } else {
                s[j] = String.valueOf(i);
            }
        }
        return s;

    }


}
