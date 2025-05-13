
/*
 *****
 *****
 *****
 *****
 *****

 */
import java.util.Scanner;

public class pattern1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int line = 1; line <= num; line++) {
            for (int star = 1; star <= num; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
