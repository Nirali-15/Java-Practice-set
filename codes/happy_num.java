/*Happy number: sum of squares of its digit , process eventually reaches 1.
 19 -> 1+81=82
 82 = 64+ 44=100
 100= 1+0+0=1
 
 22-> not a happy number
 * 
 */
public class happy_num {

    // Function to calculate sum of squares of digits
    public static int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    // Function to check if a number is happy
    public static boolean isHappy(int num) {
        int[] seen = new int[1000]; // To store seen numbers, size can be adjusted
        int index = 0;

        while (num != 1) {
            // Check if already seen
            for (int i = 0; i < index; i++) {
                if (seen[i] == num) {
                    return false; // Loop detected
                }
            }

            seen[index++] = num;
            num = getSumOfSquares(num);
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 19; // You can change this to test other numbers

        if (isHappy(number)) {
            System.out.println(number + " is a Happy Number.");
        } else {
            System.out.println(number + " is not a Happy Number.");
        }
    }
}
