package day093;

/**
 * 79. Word Search
 *
 * @author created by sunjy on 4/2/24
 */
public class WordSearch {

    public static boolean exist(char[][] board, String word) {
        // Get the dimensions of the board
        int rows = board.length, cols = board[0].length;

        // Iterate over each cell in the board
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // If the first character matches and the DFS search from this cell
                // is successful, return true
                if (board[row][col] == word.charAt(0) && dfs(board, row, col, 0, word)) {
                    return true;
                }
            }
        }
        return false; // Word not found
    }

    private static boolean dfs(char[][] board, int row, int col, int index, String word) {
        // Base case: if all characters are found
        if (index == word.length()) {
            return true;
        }

        // Check boundaries and if the current cell matches the character we're looking for
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length ||
                board[row][col] != word.charAt(index)) {
            return false;
        }

        // Mark the cell as visited by altering the character (to avoid using extra space)
        char temp = board[row][col];
        board[row][col] = ' ';

        // Explore all four directions
        boolean found = dfs(board, row + 1, col, index + 1, word) ||
                dfs(board, row - 1, col, index + 1, word) ||
                dfs(board, row, col + 1, index + 1, word) ||
                dfs(board, row, col - 1, index + 1, word);

        // Unmark the cell (backtrack)
        board[row][col] = temp;

        return found;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E' }, {'S', 'F', 'C', 'S' }, {'A', 'D', 'E', 'E' }};
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }

}
