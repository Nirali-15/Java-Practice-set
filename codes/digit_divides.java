/*check whether the digit from a given number divides the number completely or not. if any digit divides the num then print the digit and stop the porcess if not print -1
 * digit order starts from lefft to right
 * i/p: 6732632563
 */
public class digit_divides {
    public static int dividenum(int num) {
        int original_num = num;
        int ans = -1;
        while (num != 0) {
            int digit = (int) (num % 10);
            if (original_num % digit == 0) {
                ans = digit;
                break;
            }
            num = num / 10;
        }
        return ans;
    }

    public static void main(String args[]) {
        int num = 1234;
        System.out.println(dividenum(num));
    }
}
