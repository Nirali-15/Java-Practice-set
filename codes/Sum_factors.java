import java.util.Scanner;

public class Sum_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        // sum of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
