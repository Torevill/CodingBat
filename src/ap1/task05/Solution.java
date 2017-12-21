package ap1.task05;

/*

Given an array of strings, return the count of the number of strings with the given length.



 */


public class Solution {

    public int wordsCount(String[] words, int len) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) counter++;
        }
        return counter;
    }


}
