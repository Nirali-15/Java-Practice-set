
/*Aadam number:
 input 12
 * 12 *12 =144
 * reverse of 12 =21
 * 21*21=441
 * 144->441
 */
public class AdamNumber {

    // Function to reverse a number
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }

    // Main method
    public static void main(String[] args) {
        int n = 12;

        int reversedN = reverse(n); // Step 2: reverse of n
        int squareN = n * n; // Step 3a: square of original
        int squareReversed = reversedN * reversedN; // Step 3b: square of reversed
        int reversedSquare = reverse(squareReversed); // Step 4

        // Step 5: Compare
        if (squareN == reversedSquare) {
            System.out.println(n + " is an Adam number.");
        } else {
            System.out.println(n + " is NOT an Adam number.");
        }
    }
}
