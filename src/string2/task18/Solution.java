package string2.task18;

/*

Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".



 */


public class Solution {

    public String zipZap(String str) {
        if (str.length() <= 2) return str;
        StringBuilder sb = new StringBuilder(str);
        int counter = 1;
        for (int i = 2; i < str.length(); i++) {
            if (str.charAt(i) == 'p' && str.charAt(i - 2) == 'z') {
                sb.deleteCharAt(i - counter++);
            }

        }
        return sb.toString();
    }

}
