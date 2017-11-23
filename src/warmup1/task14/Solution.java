package warmup1.task14;
/*Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
 */
public class Solution {
    public String front22(String str) {
        if (str.length()<=2) return str+str+str;
        StringBuilder now = new StringBuilder(str);
        String plus = "" + str.charAt(0) + str.charAt(1);
        now.append(plus);
        now.insert(0,plus);
        return now.toString();
    }

}

