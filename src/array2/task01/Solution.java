package array2.task01;

/*

Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.



 */


public class Solution {

    public int countEvens(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) answer++;
        }
        return answer;
    }


}
