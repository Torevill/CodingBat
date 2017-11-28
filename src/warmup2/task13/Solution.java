package warmup2.task13;
/*Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 */

public class Solution {
    public String altPairs(String str) {
        if (str.length() <= 2) return str;
        String answ = "";
        for (int i = 1; i <= str.length(); i += 4) {
            if (i == str.length()) answ += str.charAt(i - 1);
            else {
                answ = answ + str.charAt(i - 1) + str.charAt(i);
            }

        }
        return answ;
    }

}
