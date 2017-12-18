package string3.task05;

/*

We'll say that a "triple" in a string is a char appearing three times in a row.
Return the number of triples in the given string. The triples may overlap.



 */


public class Solution {

    public int countTriple(String str) {
        if (str.length() <= 2) return 0;
        char temp = str.charAt(0);
        int counter = 0;
        int tempCounter = 1;
        for (int i = 1; i < str.length(); i++) {
            if (temp == str.charAt(i)) {
                tempCounter++;
                if (tempCounter >= 3)
                    counter++;
            } else {
                tempCounter = 1;
                temp = str.charAt(i);
            }
        }
        return counter;
    }

}
