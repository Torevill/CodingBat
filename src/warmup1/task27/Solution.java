package warmup1.task27;
/*
Return true if the given string contains between 1 and 3 'e' chars.*/

public class Solution {
    public static void main(String[] args) {
        stringE("Hello");
    }
    public static boolean stringE(String str) {
        StringBuilder now = new StringBuilder(str);
        int temp = now.indexOf("e");
        if (temp == -1){
            return false;
        }
        for (int i = 0; i < 3; i++) {
            now.deleteCharAt(temp);
            temp = now.indexOf("e");
            if (temp == -1) return true;
        }
        return false;
    }
}
