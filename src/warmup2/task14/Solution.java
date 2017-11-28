package warmup2.task14;

/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
but the "a" can be any char. The "yak" strings will not overlap.


 */
public class Solution {
    public String stringYak(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (str.length() <= 2) return str;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'k') {
                if (str.charAt(i - 2) == 'y') sb.replace(i - 2, i + 1, "");
            }

        }
        return sb.toString();
    }
}

