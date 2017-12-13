package string2.task04;

/*

Return the number of times that the string "hi" appears anywhere in the given string.



 */


public class Solution {

    public int countHi(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.substring(i).startsWith("hi")) counter++;

        }
        return counter;

    }


}
