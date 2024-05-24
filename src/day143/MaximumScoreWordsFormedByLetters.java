package day143;

/**
 * 1255. Maximum Score Words Formed by Letters
 *
 * @author created by sunjy on 5/23/24
 */
public class MaximumScoreWordsFormedByLetters {

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        // Frequency of each letter in the provided letters
        int[] letterCount = new int[26];
        for (char c : letters) {
            letterCount[c - 'a']++;
        }

        // Calculate the score for each word
        int[] wordScores = new int[words.length];
        int[][] wordFrequencies = new int[words.length][26];
        for (int i = 0; i < words.length; i++) {
            int currentScore = 0;
            for (char c : words[i].toCharArray()) {
                wordFrequencies[i][c - 'a']++;
                currentScore += score[c - 'a'];
            }
            wordScores[i] = currentScore;
        }

        // Use backtracking to find the maximum score
        return backtrack(words, wordFrequencies, wordScores, letterCount, 0);
    }

    private int backtrack(String[] words, int[][] wordFreq, int[] wordScores, int[] letters, int index) {
        if (index == words.length) {
            return 0;
        }

        // Option 1: skip the current word
        int maxScore = backtrack(words, wordFreq, wordScores, letters, index + 1);

        // Option 2: use the current word if possible
        boolean valid = true;
        for (int i = 0; i < 26; i++) {
            if (wordFreq[index][i] > letters[i]) {
                valid = false;
                break;
            }
        }

        if (valid) {
            // Use the word
            for (int i = 0; i < 26; i++) {
                letters[i] -= wordFreq[index][i];
            }

            // Recurse with the current word included
            int scoreIncludingWord = wordScores[index] + backtrack(words, wordFreq, wordScores, letters, index + 1);
            maxScore = Math.max(maxScore, scoreIncludingWord);

            // Backtrack: restore the counts
            for (int i = 0; i < 26; i++) {
                letters[i] += wordFreq[index][i];
            }
        }

        return maxScore;
    }

}
