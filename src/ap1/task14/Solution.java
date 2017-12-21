package ap1.task14;

/*

Given an array of strings, return a new array without the strings that are equal to the target string.
One approach is to count the occurrences of the target string, make a new array of the correct length,
and then copy over the correct strings.



 */


public class Solution {

    public String[] wordsWithout(String[] words, String target) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (!target.equals(words[i])) counter++;
        }
        String[] s = new String[counter];
        for (int i = 0, j = 0; i < words.length; i++) {
            if (!target.equals(words[i])) {
                s[j++] = words[i];
            }
        }
        return s;
    }


}
