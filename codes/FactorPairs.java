import java.util.Scanner;

public class FactorPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                int pair = number / i;
                System.out.println("(" + i + ", " + pair + ")");
            }
        }
    }
}