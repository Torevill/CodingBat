package string2.task19;

/*

Return a version of the given string, where for every star (*) in the string the star and the chars
immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".



 */


public class Solution {

    public String starOut(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = str.length() - 1; i >= 1; i--) {
            if (str.charAt(i - 1) == '*') sb.deleteCharAt(i);
            else if (str.charAt(i) == '*') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i - 1);
            }
        }
        if (sb.length() != 0 && sb.charAt(0) == '*') sb.deleteCharAt(0);
        return sb.toString();
    }

}


/*while(sb.indexOf("*") != -1){
            if (sb.indexOf("*") == 0) sb.delete(0,2);
            else if (sb.indexOf("*") == str.length()-1) sb.delete(sb.length()-2,sb.length());
            else sb.delete(sb.indexOf("*")-1,sb.indexOf("*")+2);
        }*/
