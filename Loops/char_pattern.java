import java.util.Scanner;

public class char_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int alpha = 65; // ASCII value of 'A'

        for (int line = 1; line <= num; line++) {
            for (int itr = 1; itr <= line; itr++) {
                System.out.print((char) alpha + " ");
                alpha++;
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
