package string3.task11;

/*

Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is
one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.sumNumbers("aa11b33"));
    }


    public int sumNumbers(String str) {
        String temp = "";
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp += str.charAt(i);
            } else if (!temp.equals("")) {
                answer += Integer.parseInt(temp);
                temp = "";
            } else temp = "";
        }
        if (!temp.equals("")) {
            answer += Integer.parseInt(temp);
        }
        return answer;
    }

}
