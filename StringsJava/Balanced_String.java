package StringsJava;

import java.util.Scanner;

public class Balanced_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int count = 0;
        for (int i = 0; i <= num.length() - 1; i++) {
            if (num.charAt(i) == '(') {
                count++;
            }
            if (num.charAt(i) == ')') {
                count--;
            }
        }
        if (count == 0) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}

class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0; // Sum of digits at even positions
        int oddSum = 0; // Sum of digits at odd positions

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0'; // Convert char to int

            if (i % 2 == 0) { // Even position
                evenSum += digit;
            } else { // Odd position
                oddSum += digit;
            }
        }

        return evenSum == oddSum; // Check if the sums are equal
    }
}
