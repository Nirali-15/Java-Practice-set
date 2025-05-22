package Recursion;

public class Hailstone_Series {
    public static int Hail(int num) {
        System.out.print(num + ",");
        if (num == 1) {
            return 1;
        } else if (num % 2 == 0) {
            return Hail(num / 2);
        } else {
            return Hail((num * 3) + 1);
        }
    }

    public static void main(String args[]) {
        int num = 7;
        Hail(num);

    }
}
