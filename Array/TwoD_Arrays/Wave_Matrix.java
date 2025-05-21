/*
 * print the matrix in a wave form
 * 1 9 4 10
 * 3 6 90 11
 * 2 30 8 7
 * 6 31 99 15
 * 
 * o/p: 1 3 2 6 31 30 6 9 4 90 8 99 15 7 11 10
 */
package Array.TwoD_Arrays;

public class Wave_Matrix {

    // Method to print the matrix in wave form
    public static void printWave(int[][] matrix) {
        int rows = matrix.length; // Total number of rows
        int cols = matrix[0].length; // Total number of columns

        System.out.println("Wave form output:");

        // Loop through each column
        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) {
                // If column index is even, print from top to bottom
                for (int row = 0; row < rows; row++) {

                    System.out.print(matrix[row][col] + " ");
                }
            } else {
                // If column index is odd, print from bottom to top
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        // Define the matrix
        int[][] matrix = {
                { 1, 9, 4, 10 },
                { 3, 6, 90, 11 },
                { 2, 30, 8, 7 },
                { 6, 31, 99, 15 }
        };

        // Call the method to print wave form
        printWave(matrix);
    }
}
