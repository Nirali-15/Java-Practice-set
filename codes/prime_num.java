import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(number + " Prime Number.");
        } else {
            System.out.println(number + "NOT a Prime Number.");
        }
    }
}