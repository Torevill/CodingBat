package string2.task15;

/*

A sandwich is two pieces of bread with something in between. Return the string that is between
the first and last appearance of "bread" in the given string, or return the empty string "" if
there are not two pieces of bread.



 */


public class Solution {

    public String getSandwich(String str) {
        if (str.indexOf("bread") == str.lastIndexOf("bread")) return "";
        return str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));

    }

}
