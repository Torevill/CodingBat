package ap1.task02;

/*

Given an array of scores, return true if there are scores of 100 next to each other in the array.
The array length will be at least 2.



 */


public class Solution {

    public boolean scores100(int[] scores) {
        boolean flag = false;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == 100 && scores[i - 1] == 100) flag = true;
        }
        return flag;
    }

}
