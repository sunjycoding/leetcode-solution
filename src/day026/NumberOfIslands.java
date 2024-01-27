package day026;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 200. Number of Islands
 *
 * @author created by sunjy on 1/26/24
 */
public class NumberOfIslands {

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    numIslands++;
                    grid[i][j] = '0';
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{i, j});

                    while (!queue.isEmpty()) {
                        int[] current = queue.remove();
                        int row = current[0];
                        int col = current[1];

                        if (row - 1 >= 0 && grid[row - 1][col] == '1') {
                            queue.add(new int[]{row - 1, col});
                            grid[row - 1][col] = '0';
                        }
                        if (row + 1 < rows && grid[row + 1][col] == '1') {
                            queue.add(new int[]{row + 1, col});
                            grid[row + 1][col] = '0';
                        }
                        if (col - 1 >= 0 && grid[row][col - 1] == '1') {
                            queue.add(new int[]{row, col - 1});
                            grid[row][col - 1] = '0';
                        }
                        if (col + 1 < cols && grid[row][col + 1] == '1') {
                            queue.add(new int[]{row, col + 1});
                            grid[row][col + 1] = '0';
                        }
                    }
                }
            }
        }

        return numIslands;
    }

    public static void main(String[] args) {

    }

}
