package day049;

/**
 * 240. Search a 2D Matrix II
 *
 * @author created by sunjy on 2/18/24
 */
public class Search2DMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = 0;
        int col = matrix[0].length - 1; // Start from the top-right corner

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                // Target found
                return true;
            } else if (matrix[row][col] < target) {
                // If the target is greater, move down
                row++;
            } else {
                // If the target is smaller, move left
                col--;
            }
        }

        // Target not found
        return false;
    }

}
