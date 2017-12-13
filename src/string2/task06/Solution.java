package string2.task06;

/*


Return true if the given string contains an appearance of "xyz" where the xyz is not directly
preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

 */


public class Solution {

    public boolean xyzThere(String str) {
        if (str.indexOf("xyz") != -1 && str.indexOf("xyz") == -1) return true;

        for (int i = 1; i < str.length(); i++) {
            if (str.substring(i).equals("xyz") && str.charAt(i - 1) != '.') return true;
        }
        return false;
    }


}
