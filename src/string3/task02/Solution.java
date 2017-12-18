package string3.task02;

/*

Given two strings, base and remove, return a version of the base string where all instances of the remove string
have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".



 */


public class Solution {

    public String withoutString(String base, String remove) {
        String answ = "";
        for (int i = 0; i < base.length(); ) {
            if (base.length() - i >= remove.length() && base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
                i += remove.length() - 1;
            } else answ += base.charAt(i);
            i++;
        }
        return answ;
    }

}
