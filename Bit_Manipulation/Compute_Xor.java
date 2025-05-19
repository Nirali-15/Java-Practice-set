//compute XOR from  1 to n
//i/p: 5(1^2^3^4^5) o/p:1

//XOR Operation:   5 = 0101
//                3 = 0011
//                -----------
//                2 = 0010
// 00 , 11 =0
// 10, 01 =1
package Bit_Manipulation;

import java.util.Scanner;

public class Compute_Xor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int xor = 0;
        for (int i = 0; i <= num; i++) {
            xor = xor ^ i;
        }
        System.out.println(xor);
    }
}
