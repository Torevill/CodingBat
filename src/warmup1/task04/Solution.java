package warmup1.task04;

public class Solution {
    public boolean posNeg(int a, int b, boolean negative) {
        if(a == 0) return b < 0 ? true : false;
        if(b == 0) return a < 0 ? true : false;
        if(!negative){
            return (a*b) < 0;
        }
        else{
            return a < 0 && b < 0;
        }
    }
}
