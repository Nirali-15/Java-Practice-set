import java.util.*;

public class Shifting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Division: " + (num >> 1)); // right shift
        System.out.println("Multiplication: " + (num << 1)); // left shift

    }
}

// the ans by the right sshift will be divided by 2 whereas
// the ans of the left shift will be multiplied by 2