package Loops;

import java.util.Scanner;

public class Table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int first = 1; first <= 10; first++) {
            System.out.println(num * first);
        }
    }
}
