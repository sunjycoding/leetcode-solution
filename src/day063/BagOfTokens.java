package day063;

import java.util.Arrays;

/**
 * 948. Bag of Tokens
 *
 * @author created by sunjy on 3/3/24
 */
public class BagOfTokens {

    public int bagOfTokensScore(int[] tokens, int power) {
        // Sort the tokens array
        Arrays.sort(tokens);
        int maxScore = 0;
        int currentScore = 0;
        int i = 0, j = tokens.length - 1;

        while (i <= j) {
            if (power >= tokens[i]) {
                // Play the token face up
                power -= tokens[i++];
                currentScore++;
                // Update max score
                maxScore = Math.max(maxScore, currentScore);
            } else if (currentScore > 0) {
                // Play the token face down
                power += tokens[j--];
                currentScore--;
            } else {
                // Not enough power to play face up, and no score to play face down
                break;
            }
        }

        return maxScore;
    }

}
