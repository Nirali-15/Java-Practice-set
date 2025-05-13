package Array;

public class Search_element {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int target = 30;

        int result = search(arr, target);
        System.out.println("Result: " + result);
    }

    public static int search(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return 1;
            }
        }
        return 0;
    }
}
