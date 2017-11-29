package string1.task04;

/*

Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string,
e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

 */


public class Solution {

    public String makeOutWord(String out, String word) {
        StringBuilder sb = new StringBuilder(out);
        sb.insert(2, word);
        return sb.toString();
    }


}
