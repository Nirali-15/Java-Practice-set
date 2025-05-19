/*
 * Given an array arr[] of size N, the task is to find the maximum sum non-empty subsequence present in the given array
 */
package Test_Questions;

import java.util.Scanner;

public class Tech_Mahindra1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // no of elements
        int[] arr = new int[num]; // n spaced integers

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum = 0;
        boolean hasPositive = false;
        int maxElement = arr[0];
        for (int i = 0; i < num; i++) {
            if (arr[i] > 0) {
                maxSum += arr[i];
                hasPositive = true;
            }
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        if (hasPositive) {
            System.out.println(maxSum);
        } else {
            System.out.println(maxElement);
        }
        sc.close();
    }
}