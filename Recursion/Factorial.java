package Recursion;

public class Factorial {
    public static int Fact(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * Fact(num - 1);
        }
    }

    public static void main(String args[]) {
        int num = 5;
        System.out.println(Fact(num));

    }
}
