//package Sorting;

public class Bubble_Sort {
    public static void main(String args[]) {
        int arr[] = { 3, 4, 1, 5, 2 };
        int n = arr.length;
        for (int itr = 0; itr < n; itr++) {
            int flag = 0;
            for (int check = 0; check < n - itr - 1; check++) {
                if (arr[check] > arr[check + 1]) {
                    int temp = arr[check];
                    arr[check] = arr[check + 1];
                    arr[check + 1] = temp;
                    flag = 1;
                    System.out.println();
                }
            }
            if (flag == 0) {
                System.out.println("Sorted Array");
                break;
            }
        }
    }
}
