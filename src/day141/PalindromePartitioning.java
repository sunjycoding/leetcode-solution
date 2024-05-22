package day141;

import java.util.ArrayList;
import java.util.List;

/**
 * 131. Palindrome Partitioning
 *
 * @author created by sunjy on 5/21/24
 */
public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), s, 0);
        return result;
    }

    private void backtrack(List<List<String>> result, List<String> temp, String s, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(temp));
        } else {
            for (int end = start; end < s.length(); end++) {
                if (isPalindrome(s, start, end)) {
                    temp.add(s.substring(start, end + 1));
                    backtrack(result, temp, s, end + 1);
                    temp.removeLast();
                }
            }
        }
    }

    private boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }

}
