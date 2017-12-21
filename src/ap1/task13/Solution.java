package ap1.task13;

/*

The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}.
the "answers" array contains a student's answers, with "?" representing a question left blank.
The two arrays are not empty and are the same length. Return the score for this array of answers,
giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.



 */


public class Solution {

    public int scoreUp(String[] key, String[] answers) {
        int points = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) points += 4;
            else if (answers[i].equals("?")) continue;
            else points -= 1;
        }
        return points;
    }


}