import java.util.Scanner;

public class PrimeFactorizationDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // First check for 2 bcoz 2 is the only even prime no
        if (number % 2 == 0) {
            System.out.print(2 + " ");
            while (number % 2 == 0) {
                number /= 2; // updating quotient value and checking whther it is divided by 2 or not, if it
                             // will not be divided by 2 then go to
                // next prime no that is 3, if that also not go to 5, and so on.
            }
        }
        // rest all are prime numbers are odd , Then check for odd primes
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                System.out.print(i + " ");
                while (number % i == 0) {
                    number /= i;
                }
            }
        }

        // If number > 2, it's a prime itself
        if (number > 2) {
            System.out.print(number);
            // all the numbers > 2 have some prime factor. 1 is the only number which does
            // not have any prime factor
        }

    }
}
