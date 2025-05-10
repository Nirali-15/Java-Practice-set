
/*-> magic number: a num where the multiplication of the sum of of its digits and the same number is equal to the original number.
1729 = 1+ 7+ 2+ 9 = 19
reverse of 19 is 91 
19 * 91 = 1729
*/
import java.util.Scanner;

public class magic_num {

    // Function to calculate sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to reverse a number
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int digitSum = sumOfDigits(n);
        int reversedSum = reverse(digitSum);
        int product = digitSum * reversedSum;

        if (product == n) {
            System.out.println(n + " is a Magic Number.");
        } else {
            System.out.println(n + " is NOT a Magic Number.");
        }

        sc.close();
    }
}
