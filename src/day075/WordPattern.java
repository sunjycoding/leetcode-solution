package day075;

import java.util.HashMap;
import java.util.Map;

/**
 * 290. Word Pattern
 *
 * @author created by sunjy on 3/15/24
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        // Check if pattern length is equal to the number of words in s
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charToWordMap = new HashMap<>();
        Map<String, Character> wordToCharMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // If the mapping does not exist, create it
            if (!charToWordMap.containsKey(c) && !wordToCharMap.containsKey(word)) {
                charToWordMap.put(c, word);
                wordToCharMap.put(word, c);
            } else {
                // If the mapping exists, check for consistency
                if (!word.equals(charToWordMap.get(c)) || c != wordToCharMap.get(word)) {
                    return false;
                }
            }
        }
        return true;
    }

}
