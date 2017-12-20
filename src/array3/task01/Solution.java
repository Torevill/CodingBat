package array3.task01;

/*

Consider the leftmost and righmost appearances of some value in an array.
We'll say that the "span" is the number of elements between the two inclusive.
A single value has a span of 1. Returns the largest span found in the given array.
(Efficiency is not a priority.)



 */


public class Solution {

    public int maxSpan(int[] nums) {
        int counter = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    int temp = j - i + 1;
                    if (temp > counter) counter = temp;
                }
            }
        }
        return counter;
    }

}
