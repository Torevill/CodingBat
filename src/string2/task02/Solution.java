package string2.task02;

/*


Return true if the string "cat" and "dog" appear the same number of times in the given string.

 */


public class Solution {

    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("cat")) cat++;
            else if (str.substring(i).startsWith("dog")) dog++;
        }
        return cat == dog;
    }

}
