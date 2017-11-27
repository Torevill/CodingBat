package warmup2.task05;
/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".*/

public class Solution {
    public String stringBits(String str) {
        String answ = "";
        for (int i = 0; i < str.length(); i += 2) {
            answ += str.charAt(i);
        }
        return answ;
    }
}
