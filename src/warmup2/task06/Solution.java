package warmup2.task06;
/*Given a non-empty string like "Code" return a string like "CCoCodCode".*/

public class Solution {
    public String stringSplosion(String str) {
        String answ = "";
        for (int i = 0; i <= str.length(); i++) {
            answ += str.substring(0, i);

        }
        return answ;
    }


}
