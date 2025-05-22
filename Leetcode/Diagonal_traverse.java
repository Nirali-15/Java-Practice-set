/*
 * Upwards -> col++, row--
 * Downwards -> col--, row++
 * Upwards -> when col=length of col -> row++
 *           when row=length of row -> col++
 * Downwards -> when col =length of col -1 -> col++
 *              when row=length of row -1 -> row++
 * if(row+col=even) -> go upward
 * if(row+col=odd) -> go downward
 * 
 */

package Leetcode;

public class Diagonal_traverse {

    public static int[] diagonalTraverse(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return new int[0];

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows * cols];

        int row = 0, col = 0, direction = 1;
        int index = 0;

        while (index < rows * cols) {
            result[index++] = matrix[row][col];

            // Moving up-right
            if (direction == 1) {
                if (col == cols - 1) {
                    row++;
                    direction = -1;
                } else if (row == 0) {
                    col++;
                    direction = -1;
                } else {
                    row--;
                    col++;
                }
            }

            // Moving down-left
            else {
                if (row == rows - 1) {
                    col++;
                    direction = 1;
                } else if (col == 0) {
                    row++;
                    direction = 1;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }

    // Main method to test
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[] result = diagonalTraverse(matrix);

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
