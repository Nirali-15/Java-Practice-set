package Array;

import java.util.Scanner;

public class Count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] == 0) {
                zero++;
            } else {
                one++;
            }
        }
        System.out.println("zero: " + zero);
        System.out.println("one: " + one);

    }
}
