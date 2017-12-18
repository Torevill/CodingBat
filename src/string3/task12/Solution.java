package string3.task12;

/*

Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this"
does not count. (Note: Character.isLetter(char) tests if a char is a letter.)



 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.notReplace("This is right"));
        System.out.println(sol.notReplace("is test"));
        System.out.println(sol.notReplace("is-is"));
        System.out.println(sol.notReplace("-is"));

    }

    public String notReplace(String str) {
        if (str.length() <= 2) {
            if (str.equals("is")) return "is not";
            else return str;
        }
        String answer = "";
        int i = 1;
        if (str.substring(0, 2).equals("is") && !Character.isLetter(str.charAt(2))) {
            answer = "is not";
            i = 2;
        } else answer += str.charAt(0);

        for (; i < str.length() - 2; i++) {
            if (str.substring(i).startsWith("is")
                    && !Character.isLetter(str.charAt(i + 2))
                    && !Character.isLetter(str.charAt(i - 1))) {
                answer += "is not";
                i++;
            } else answer += str.charAt(i);
        }
        if (str.substring(str.length() - 2).equals("is") && !Character.isLetter(str.charAt(str.length() - 3)))
            answer += "is not";
        else answer += (str.substring(str.length() - 2));


        return answer;
    }

}
