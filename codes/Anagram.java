public class Anagram {
    public static void main(String[] args) {
        int a = 47672;
        int b = 42776;

        if (digitPowerSum(a) == digitPowerSum(b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static int digitPowerSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 4); // Raise each digit to power 4
            num /= 10;
        }
        return sum;
    }
}
