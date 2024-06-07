package day157;

import java.util.List;

/**
 * 648. Replace Words
 *
 * @author created by sunjy on 6/6/24
 */
public class ReplaceWords {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = null;  // Stores the full word at the end nodes
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        // Create the trie root
        TrieNode root = new TrieNode();

        // Insert all dictionary words into the trie
        for (String word : dictionary) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode();
                }
                node = node.children[c - 'a'];
            }
            node.word = word; // Mark the end of a word
        }

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (result.length() > 0) {
                result.append(" ");
            }
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null || node.word != null) {
                    break;
                }
                node = node.children[c - 'a'];
            }
            result.append(node.word != null ? node.word : word);
        }

        return result.toString();
    }

}
