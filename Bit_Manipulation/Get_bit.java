//get bit at ith position from right side
// i/p : 13 = 1101
// 2
//o/p :0

package Bit_Manipulation;

import java.util.*;

public class Get_bit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = sc.nextInt();
        int bit = (num >> i) + 1;
        System.out.println(bit & 1);

    }
}
