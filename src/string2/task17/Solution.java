package string2.task17;

/*

Given a string, compute a new string by moving the first char to come after the next two chars,
so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields
"bcaefd". Ignore any group of fewer than 3 chars at the end.



 */


public class Solution {


    public String oneTwo(String str) {
        if (str.length() <= 2) return "";
        String answ = "";
        for (int i = 2; i < str.length(); i++) {
            if ((i + 1) % 3 == 0) {
                answ = answ + str.charAt(i - 1) + str.charAt(i) + str.charAt(i - 2);
            }
        }


        return answ;
    }


}
