package logic1.task24;

/*

Return the sum of two 6-sided dice rolls, each in the range 1..6.
However, if noDoubles is true, if the two dice show the same value, increment one die to the next value,
wrapping around to 1 if its value was 6.



 */


public class Solution {

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            return die1 == 6 ? die1 + die2 - 5 : die1 + die2 + 1;
        } else return die1 + die2;
    }

}
