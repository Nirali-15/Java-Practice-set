//a java function that counts the no of set bits (1s) int the binary representation of a given no.
//ip : 13(1101) o/p:3

package Bit_Manipulation;

import java.util.Scanner;

public class Count_Set_bits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while (num != 0) {
            count += num & 1;
            num = num >> 1;
        }
        System.out.println(count);
        sc.close();

    }
}
