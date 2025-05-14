//row number== total no of columns
package Looping;

public class Half_pyramid {
    public static void main(String args[]) {
        int a = 4;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
