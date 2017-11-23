package warmup1.task22;
/*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
*/

public class Solution {
    public String startOz(String str) {
        String answ = "";
        if(str.equals("")) return answ;
        else if (str.length() == 1 && str.equals("o")) return answ+"o";
        if(str.charAt(0)=='o') answ = answ + "o";
        else if (str.charAt(1) == 'z') answ = answ + "z";
        return answ;
    }
}
