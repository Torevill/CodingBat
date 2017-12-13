package string2.task21;

/*


Given a string and a non-empty word string, return a string made of each char just
before and just after every appearance of the word in the string.
Ignore cases where there is no char before or after the word, and a char
may be included twice if it is between two words.

 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.wordEnds("XY", "XY"));
        System.out.println(sol.wordEnds("abc1xyz11", "1"));
    }

    public String wordEnds(String str, String word) {
        String answ = "";
        for (int i = 0; i < str.length(); ) {
            if (str.startsWith(word) && i == 0 && str.length() > word.length()) {
                answ += str.charAt(word.length());
                i++;
            } else if (str.substring(i).startsWith(str.charAt(i) + word)) {
                answ += str.charAt(i);
                if (str.substring(i).length() >= word.length() + 2) {
                    answ += str.charAt(i + word.length() + 1);
                }
                i += word.length();

            } else if (str.substring(i).startsWith(str.charAt(i) + word)
                    && str.substring(i).length() == word.length() + 1) {
                answ += str.charAt(i);
                break;
            } else i++;


        }
        return answ;
    }


}
