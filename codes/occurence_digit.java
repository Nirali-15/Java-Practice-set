import java.util.*;

public class occurence_digit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int target = sc.nextInt();
        int count = 0;
        while (num != 0) {
            int digit = (int) (num % 10);
            if (digit == target) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }

}
