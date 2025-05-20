//circular shift the array up
// 123
// 456
// 789
//o/p: 456
// 789
// 123
package Array.TwoD_Arrays;

public class Circular_Shift {
    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int temp[] = matrix[0];
        matrix[0] = matrix[1];
        matrix[1] = matrix[2];
        matrix[2] = temp;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
