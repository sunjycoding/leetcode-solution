package day151;

/**
 * 3110. Score of a String
 *
 * @author created by sunjy on 5/31/24
 */
public class ScoreOfString {

    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 1; i < s.length(); i++) {
            // Compute the absolute difference between adjacent characters
            int diff = Math.abs(s.charAt(i) - s.charAt(i - 1));
            // Accumulate the difference to the score
            score += diff;
        }
        return score;
    }

}
