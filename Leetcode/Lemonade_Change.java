package Leetcode;

public class Lemonade_Change {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++; // no change needed
            } else if (bill == 10) {
                if (five == 0)
                    return false;
                five--;
                ten++; // give ₹5 change
            } else { // bill == 20
                if (ten > 0 && five > 0) {
                    ten--;
                    five--; // give ₹10 + ₹5
                } else if (five >= 3) {
                    five -= 3; // give three ₹5s
                } else {
                    return false; // can't give change
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] bills = { 5, 5, 5, 10, 20 };
        System.out.println(lemonadeChange(bills)); // Output: true
    }
}
