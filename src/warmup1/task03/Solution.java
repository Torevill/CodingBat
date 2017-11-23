package warmup1.task03;

public class Solution {
    public boolean nearHundred(int n) {
        return Math.abs(100-n)<=10 || Math.abs(200-n)<=10;
    }
}
