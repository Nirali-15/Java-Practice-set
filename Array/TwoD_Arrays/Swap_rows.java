package Array.TwoD_Arrays;

public class Swap_rows {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int totalColumns = matrix[0].length;
        int firstRow = 0;
        int lastRow = matrix.length - 1;

        // Swap first row and last row
        for (int columnIndex = 0; columnIndex < totalColumns; columnIndex++) {
            int temp = matrix[firstRow][columnIndex];
            matrix[firstRow][columnIndex] = matrix[lastRow][columnIndex];
            matrix[lastRow][columnIndex] = temp;
        }

        // Print the modified matrix
        System.out.println("Matrix after swapping first and last rows:");
        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++) {
                System.out.print(matrix[rowIndex][columnIndex] + " ");
            }
            System.out.println();
        }
    }
}
