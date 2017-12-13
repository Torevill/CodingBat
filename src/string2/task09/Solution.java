package string2.task09;

/*


Given two strings, a and b, create a bigger string made of the first char of a,
the first char of b, the second char of a, the second char of b, and so on.
Any leftover chars go at the end of the result.

 */


public class Solution {

    public String mixString(String a, String b) {
        String answ = "";
        if (a.length() > b.length()) {
            for (int i = 0; i < b.length(); i++) {
                answ = answ + a.charAt(i) + b.charAt(i);
            }
            answ = answ + a.substring(b.length());
        } else {
            for (int i = 0; i < a.length(); i++) {
                answ = answ + a.charAt(i) + b.charAt(i);
            }
            answ = answ + b.substring(a.length());
        }
        return answ;


    }

}
