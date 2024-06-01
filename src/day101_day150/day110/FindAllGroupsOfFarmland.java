package day101_day150.day110;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1992. Find All Groups of Farmland
 *
 * @author created by sunjy on 4/19/24
 */
public class FindAllGroupsOfFarmland {

    public static int[][] findFarmland(int[][] land) {
        int m = land.length, n = land[0].length;
        List<int[]> results = new ArrayList<>();
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    int[] corners = new int[]{i, j, i, j};  // initialize corners as [top-left, bottom-right]
                    dfs(land, visited, i, j, corners);
                    results.add(new int[]{corners[0], corners[1], corners[2], corners[3]});
                }
            }
        }

        return results.toArray(new int[results.size()][4]);
    }

    private static void dfs(int[][] land, boolean[][] visited, int x, int y, int[] corners) {
        int m = land.length, n = land[0].length;
        if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y] || land[x][y] == 0) {
            return;
        }

        // Mark this cell as visited
        visited[x][y] = true;

        // Update the corners of the rectangle
        corners[0] = Math.min(corners[0], x);
        corners[1] = Math.min(corners[1], y);
        corners[2] = Math.max(corners[2], x);
        corners[3] = Math.max(corners[3], y);

        // Explore all 4 possible directions
        dfs(land, visited, x + 1, y, corners);  // down
        dfs(land, visited, x - 1, y, corners);  // up
        dfs(land, visited, x, y + 1, corners);  // right
        dfs(land, visited, x, y - 1, corners);  // left
    }

    public static void main(String[] args) {
        int[][] land = new int[][]{{1, 0, 0}, {0, 1, 1}, {0, 1, 1}};
        System.out.println(Arrays.deepToString(findFarmland(land)));
    }
}
