package Leetcode;

import java.util.Arrays;

public class Max_Odd_Binaryno {
    public static void main(String args[]) {
        String str = "0111";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sorted = new String(charArray); // "0011"

        int count1 = 0;
        int count0 = 0;
        for (char c : sorted.toCharArray()) {// Count number of '1's and '0's
            if (c == '1')
                count1++;
            else
                count0++;
        }

        String result = "";
        // The sorted string starts with '0' because zeros come first in sorted order
        // Result form -> (count1-1) ones + zeros + one '1' at end
        if (count1 == 0) {
            System.out.println(sorted);
        } else {
            for (int i = 0; i < count1 - 1; i++)
                result += '1';
            for (int i = 0; i < count0; i++)
                result += '0';
            result += '1'; // Append one '1' at the end to ensure the number is odd

            System.out.println(result); // Output: 1001
        }
    }
}
