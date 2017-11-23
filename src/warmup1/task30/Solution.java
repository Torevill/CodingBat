package warmup1.task30;
/*Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string.
So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.*/

public class Solution {
    public String everyNth(String str, int n) {
        String answ = "";
        for (int i = 0; i < str.length(); i+=3) {
            answ += str.charAt(i);
        }
        return answ;
    }
}
