
//-> Harshad number is a number that is divisible by the sum of its digits.
import java.util.*;

public class harshad_no {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long original = num;
        int sum = 0;

        while (num != 0) {
            int digit = (int) (num % 10);
            sum = sum + digit;
            num = num / 10;
        }
        if (original % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }
    }
}
