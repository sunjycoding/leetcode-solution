package day128;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 506. Relative Ranks
 *
 * @author created by sunjy on 5/7/24
 */
public class RelativeRanks {

    public String[] findRelativeRanks(int[] score) {
        // Create a copy of the score array and sort it in descending order
        int[] sortedScore = Arrays.copyOf(score, score.length);
        Arrays.sort(sortedScore);
        Map<Integer, Integer> scoreToRank = new HashMap<>();

        // Assign ranks to scores
        int rank = 1;
        for (int i = sortedScore.length - 1; i >= 0; i--) {
            if (!scoreToRank.containsKey(sortedScore[i])) {
                scoreToRank.put(sortedScore[i], rank++);
            }
        }

        // Assign ranks to athletes based on their scores
        String[] answer = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int currentRank = scoreToRank.get(score[i]);
            switch (currentRank) {
                case 1:
                    answer[i] = "Gold Medal";
                    break;
                case 2:
                    answer[i] = "Silver Medal";
                    break;
                case 3:
                    answer[i] = "Bronze Medal";
                    break;
                default:
                    answer[i] = String.valueOf(currentRank);
            }
        }

        return answer;
    }

}
