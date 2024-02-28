package day001_day050.day002;

import java.util.Arrays;

/**
 * 498. Diagonal Traverse
 *
 * @author created by sunjy on 1/2/24
 */
public class DiagonalTraverse {

    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int length = m * n;
        int[] arr = new int[length];
        int row = 0;
        int col = 0;
        int index = 0;
        boolean dirUp = true;
        while (index < length) {
            arr[index++] = mat[row][col];
            if (dirUp) {
                if (col == n - 1) {
                    // right boundary
                    row++;
                    dirUp = false;
                } else if (row == 0) {
                    // top boundary
                    col++;
                    dirUp = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    // bottom boundary
                    col++;
                    dirUp = true;
                } else if (col == 0) {
                    // left boundary
                    row++;
                    dirUp = true;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }

}
