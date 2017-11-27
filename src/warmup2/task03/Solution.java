package warmup2.task03;

/*Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
*/

public class Solution {
    int countXX(String str) {
        int answ = 0;
        while (true) {
            if (str.indexOf("xx") == -1) {
                return answ;
            } else {
                str = str.substring(str.indexOf("xx") + 1, str.length());
                answ++;
            }
        }

    }
}
