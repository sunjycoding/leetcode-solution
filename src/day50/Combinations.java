package day50;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. Combinations
 *
 * @author created by sunjy on 2/19/24
 */
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        backtrack(combinations, new ArrayList<>(), 1, n, k);
        return combinations;
    }

    private void backtrack(List<List<Integer>> combinations, List<Integer> current, int start, int n, int k) {
        if (k == 0) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n - k + 1; i++) {
            current.add(i);
            backtrack(combinations, current, i + 1, n, k - 1);
            current.removeLast();
        }
    }

}
