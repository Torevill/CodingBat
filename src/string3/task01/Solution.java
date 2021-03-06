package string3.task01;

/*

Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is
not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)



 */


public class Solution {

    public int countYZ(String str) {
        String[] arr = str.split("[^A-Za-z]");
        int counter = 0;
        for (String now : arr) {
            if (now.endsWith("y") || now.endsWith("z")) counter++;
            if (now.endsWith("Y") || now.endsWith("Z")) counter++;
        }
        return counter;
    }

}
