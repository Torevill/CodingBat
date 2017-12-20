package string3.task06;

/*

Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars
'0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)



 */


public class Solution {

    public int sumDigits(String str) {
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                answer += Integer.parseInt("" + str.charAt(i));
            }
        }
        return answer;

    }

}