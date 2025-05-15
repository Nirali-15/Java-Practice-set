import java.util.*;

public class pow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        int count = 0;
        int ori = (int) num;
        while (num != 0) {
            num = num / 10;
            count++;

        }
        long pow = (long) Math.pow(10, count - 1); // power value
        System.out.println(pow);
        num = ori;
        while (pow >= 1);c
        {
            int dig = (int) (num / pow);
            System.out.println(dig);
            num = num % pow;
            pow = pow / 10;
        }
    }
}
