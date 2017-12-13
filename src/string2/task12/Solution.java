package string2.task12;

/*

Given two strings, word and a separator sep, return a big string made of
count occurrences of the word, separated by the separator string.



 */


public class Solution {

    public String repeatSeparator(String word, String sep, int count) {
        String answ = "";
        int i = 0;
        if (count == 0) return answ;
        while (true) {
            answ += word;
            i++;
            if (i == count) break;
            answ += sep;
        }
        return answ;

    }

}
