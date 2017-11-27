package warmup2.task01;

/*Given a string and a non-negative int n, return a larger string that is n copies of the original string.*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
    }
    public static String stringTimes(String str, int n) {
        String answ = str;
        for (int i = 0; i < n; i++) {
            answ += str;

        }
        return answ;
    }
}
