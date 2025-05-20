package Leetcode;

public class Minimum_Flips {
    public int minFlips(int a, int b, int c) {
        int flips = 0;

        for (int i = 0; i < 32; i++) {
            int bitA = (a >> i) & 1;
            int bitB = (b >> i) & 1;
            int bitC = (c >> i) & 1;

            if ((bitA | bitB) == bitC) {
                continue; // no flip needed
            } else {
                if (bitC == 1) {
                    // both bits are 0, need one flip to make one 1
                    flips += 1;
                } else {
                    // c is 0, flip each 1 in a or b to 0
                    if (bitA == 1)
                        flips += 1;
                    if (bitB == 1)
                        flips += 1;
                }
            }
        }

        return flips;
    }
}
