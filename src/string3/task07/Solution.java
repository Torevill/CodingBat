package string3.task07;

/*

Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
For example, sameEnds("abXab") is "ab".



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.sameEnds("abXYab"));
    }

    public String sameEnds(String string) {
        StringBuilder answer = new StringBuilder(string.substring(0, string.length() / 2));
        for (int i = string.length() / 2; i >= 1; i--) {
            if (string.endsWith(answer.toString())) {
                return answer.toString();
            }
            answer.deleteCharAt(i - 1);
        }
        return "";
    }

}
