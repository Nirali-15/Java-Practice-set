/*
 * Create mirror image of a 2D array
 * Example Input:
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * Output:
 * 4 3 2 1
 * 8 7 6 5
 * 12 11 10 9
 */
package Array.TwoD_Arrays;

public class Mirror_Image {

    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        // Call the mirror image method
        MI(matrix);

        // Print the mirrored matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to create mirror image by reversing each row
    public static void MI(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr[i].length - 1;

            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
