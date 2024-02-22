package day052;

import java.util.ArrayList;
import java.util.List;

/**
 * 17. Letter Combinations of a Phone Number
 *
 * @author created by sunjy on 2/21/24
 */
public class LetterCombinationsOfPhoneNumber {

    private final String[] LETTER_MAP = {
            "",    // 0
            "",    // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs",// 7
            "tuv", // 8
            "wxyz" // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations;
    }

    private void backtrack(List<String> combinations, StringBuilder current, String digits, int index) {
        // If the current combination is complete
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }

        String letters = LETTER_MAP[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            // Add the letter
            current.append(letter);
            // Move on to the next digit
            backtrack(combinations, current, digits, index + 1);
            // Backtrack
            current.deleteCharAt(current.length() - 1);
        }
    }

}
