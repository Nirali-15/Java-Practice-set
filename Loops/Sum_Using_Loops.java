import java.util.Scanner;

public class Sum_Using_Loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int first = 1; first <= n; first++) {
            sum += first;
        }
        System.out.println("Sum of " + n + " natural numbers is: " + sum + ".");
    }
}