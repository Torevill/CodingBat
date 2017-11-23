package warmup1.task29;
/*Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase()
returns the uppercase version of a string.
 */
public class Solution {
    public String endUp(String str) {
        if (str.length() <= 3) return str=str.toUpperCase();
        String str1 = str.substring(0,str.length()-3);
        String str2 = str.substring(str.length()-3,str.length());
        str2 = str2.toUpperCase();
        return str1+str2;
    }
}
