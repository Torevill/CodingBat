package string3.task03;

/*

Given a string, return true if the number of appearances of "is" anywhere in the string is equal
to the number of appearances of "not" anywhere in the string (case sensitive).



 */


public class Solution {

    public boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("is")) is++;
            else if (str.substring(i).startsWith("not")) not++;

        }
        return is == not;
    }

}
