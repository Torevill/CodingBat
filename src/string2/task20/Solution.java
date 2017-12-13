package string2.task20;

/*


Given a string and a non-empty word string, return a version of the original String
where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

 */


public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.plusOut("12xy34", "xy"));
        System.out.println(sol.plusOut("--++ab", "++"));
        String str = "12xy34";
        System.out.println(str);

    }

    public String plusOut(String str, String word) {
        String answ = "";
        for (int i = 0; i < str.length(); ) {
            if (str.substring(i).startsWith(word)) {
                answ += word;
                i += word.length();
            } else {
                answ += "+";
                i++;
            }

        }
        return answ;
    }

}

/* public String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder(str);

        str = str.replaceAll(word,"+!+");
        str = str.replaceAll("[A-Za-zА-Яа-я0-9]", "+");
        str = str.replaceAll("(\\+\\!\\+)",word);
        return str;
    }*/
