package string3.task04;

/*

We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
immediately to its left or right. Return true if all the g's in the given string are happy.



 */


public class Solution {

    public boolean gHappy(String str) {
        if (str.length() == 1) return false;
        for (int i = 0; i < str.length(); ) {
            if (i != str.length() - 1 && str.charAt(i) == 'g' && str.charAt(i + 1) == 'g') i += 3;
            else if (i != str.length() - 1 && str.charAt(i) == 'g' && str.charAt(i + 1) != 'g') return false;
            else if (i == str.length() - 1 && str.charAt(i) == 'g' && str.charAt(i - 1) != 'g') return false;
            else i++;
        }
        return true;
    }

}
