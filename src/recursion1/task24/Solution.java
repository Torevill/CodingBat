package recursion1.task24;

/*

Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced
to a single char. So "yyzzza" yields "yza".



 */


public class Solution {

    public String stringClean(String str) {
        if (str.length() == 0) return str;
        else if (str.length() == 1) return str;
        else if (str.charAt(0) != str.charAt(1)) return str.charAt(0) + stringClean(str.substring(1));
        else return stringClean(str.substring(1));
    }


}
