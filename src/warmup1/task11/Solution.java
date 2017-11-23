package warmup1.task11;
/*Given a string, return a new string where the first and last chars have been exchanged.*/

public class Solution {
    public String frontBack(String str) {
        if (str.equals("")) return str;
        StringBuilder now = new StringBuilder(str);
        now.append(now.charAt(0));
        now.insert(0, now.charAt(now.length()-2));
        now.deleteCharAt(1);
        now.deleteCharAt(now.length()-2);
        return now.toString();
    }
}
