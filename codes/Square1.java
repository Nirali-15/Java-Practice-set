import java.util.Scanner;

public class Square1 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int num;
        int row;
        int col;
        num = kbd.nextInt();

        for (row = 1; row <= num; row++) {
            for (col = 1; col <= num; col++) {
                if (row == 1 || row == num || col == 1 || col == num) {
                    System.out.print(" * ");
                }

            }

            System.out.println();

        }

    }
}