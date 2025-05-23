package Leetcode;

import java.util.Scanner;

public class Circular_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// no.of friends
        int k = sc.nextInt();// no of positions to move including the started position
        int winner = findTheWinner(n, k);
        System.out.println(winner);
    }

    public static int findTheWinner(int n, int k) {
        if (n == 1)
            return 1;
        return (findTheWinner(n - 1, k) + k - 1) % n + 1;
    }
}
