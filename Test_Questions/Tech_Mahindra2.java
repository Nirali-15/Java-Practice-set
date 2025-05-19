/*
 * Given two strings, write a program to count all the common sub-sequences of the two strings and print them.

A sub-sequence of a string is a sequence of characters that appear in the same order as in the original string, but not necessarily 

consecutively. If there are no common subsequences or if the input strings do not follow the specified format, print 0.
 */
package Test_Questions;

import java.util.*;

public class Tech_Mahindra2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int n = str1.length();
        int m = str2.length();

        if (n == 0 || m == 0) {
            System.out.println(0);
            return;
        }
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
                }
            }
        }
        System.out.println(Math.max(dp[n][m], 0));
        sc.close();
    }
}