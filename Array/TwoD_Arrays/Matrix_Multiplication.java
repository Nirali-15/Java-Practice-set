/*
 * If
Matrix A is of size m x n
Matrix B is of size n x p
Then the result matrix C will be of size m x p
 */

package Array.TwoD_Arrays;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        // Define first matrix A
        int[][] A = {
                { 1, 2 },
                { 3, 4 }
        };

        // Define second matrix B
        int[][] B = {
                { 5, 6 },
                { 7, 8 }
        };

        // Create result matrix with correct size (2x2 in this case)
        int[][] result = new int[2][2];

        // Multiply the matrices
        for (int i = 0; i < 2; i++) { // Rows of A
            for (int j = 0; j < 2; j++) { // Columns of B
                result[i][j] = 0; // Start from 0
                for (int k = 0; k < 2; k++) { // Columns of A / Rows of B
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print the result matrix
        System.out.println("Result of A x B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
