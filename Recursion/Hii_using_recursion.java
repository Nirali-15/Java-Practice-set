package Recursion;

public class Hii_using_recursion {
    public static void print(String str, int count) {
        if (count == 0) {
            return;
        }
        System.out.println(str);
        print(str, count - 1);
    }

    public static void main(String args[]) {
        String str = "Hii";
        print(str, 1);
    }
}
