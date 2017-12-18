package string3.task09;

/*

Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.maxBlock("abbbcbbbxbbbx"));
    }

    public int maxBlock(String str) {
        if (str.length() == 0) return 0;
        int max = 1;
        int tempMax = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                tempMax++;
                if (tempMax > max) {
                    max = tempMax;
                }
            } else tempMax = 1;

        }
        return max;
    }


}
