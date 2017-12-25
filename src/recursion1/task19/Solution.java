package recursion1.task19;

/*

Given a string, compute recursively a new string where identical chars that are adjacent
in the original string are separated from each other by a "*".



 */


public class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.pairStar("hello"));
    }

    public String pairStar(String str) {
        if (str.length() == 0) return str;
        if (str.length() == 1) return str;
        else if (str.charAt(0) == str.charAt(1)) return str.charAt(0) + "*" + pairStar(str.substring(1));
        else return str.charAt(0) + pairStar(str.substring(1));
    }

}
