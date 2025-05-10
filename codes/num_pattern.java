import java.util.Scanner;

public class num_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int line = 1; line <= num; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print(line + " ");
            }
            System.out.println();
        }
    }
}

/*
 * Enter a number: 5
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */
