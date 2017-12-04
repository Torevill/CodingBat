package logic1.task03;

/*

The squirrels in Palo Alto spend most of the day playing.
In particular, they play if the temperature is between 60 and 90 (inclusive).
Unless it is summer, then the upper limit is 100 instead of 90.
Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.

 */


public class Solution {

    public boolean squirrelPlay(int temp, boolean isSummer) {
        return temp >= 60 && ((isSummer && temp <= 100) || (!isSummer && temp <= 90));
    }


}
