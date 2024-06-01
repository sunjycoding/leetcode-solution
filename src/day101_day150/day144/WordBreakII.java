package day101_day150.day144;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 140. Word Break II
 *
 * @author created by sunjy on 5/24/24
 */
public class WordBreakII {

    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordDict);
        backtrack(s, "", result, dict);
        return result;
    }

    private void backtrack(String s, String current, List<String> result, Set<String> dict) {
        if (s.isEmpty()) {
            result.add(current.substring(1));
            return;
        }

        for (int i = 1; i <= s.length(); i++) {
            String word = s.substring(0, i);
            if (dict.contains(word)) {
                backtrack(s.substring(i), current + " " + word, result, dict);
            }
        }
    }

}
