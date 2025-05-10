
/*
 * given an int num, repeatedly add all its digits until the result has only only one digit and return it.
 * 38=3+8=11
 * 1+1=2
 */
import java.util.Scanner;

public class add_digit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 9 == 0) {
            System.out.println("9");
        } else {
            System.out.println(num % 9);
        }
    }
}