package warmup1.task20;
/*Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
Otherwise, return the string unchanged.
 */



public class Solution {
    public String delDel(String str) {
        if(str.length()<=3) return str;
        else if (!str.substring(1,4).equals("del")) return str;
        StringBuilder now = new StringBuilder(str);
        now.delete(1,4);
        return now.toString();
    }
}
