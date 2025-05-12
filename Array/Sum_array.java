package Array;

public class Sum_array {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int result = total(arr);
        System.out.println("Sum: " + result);
    }

    public static int total(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
