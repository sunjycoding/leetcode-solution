package day051_day100.day053;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses
 *
 * @author created by sunjy on 2/22/24
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<>();
        backtrack(combinations, "", 0, 0, n);
        return combinations;
    }

    private void backtrack(List<String> combinations, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            combinations.add(current);
            return;
        }

        if (open < max) {
            backtrack(combinations, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(combinations, current + ")", open, close + 1, max);
        }
    }

}
