package day105;

import java.util.HashMap;
import java.util.Map;

/**
 * 2352. Equal Row and Column Pairs
 *
 * @author created by sunjy on 4/14/24
 */
public class EqualRowAndColumnPairs {

    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();

        // Collect all row representations in HashMap
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append(',');
            }
            String rowStr = sb.toString();
            rowMap.put(rowStr, rowMap.getOrDefault(rowStr, 0) + 1);
        }

        int count = 0;

        // Check each column against the row representations
        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(grid[i][j]).append(',');
            }
            String colStr = sb.toString();
            if (rowMap.containsKey(colStr)) {
                count += rowMap.get(colStr);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(equalPairs(grid));
    }

}
