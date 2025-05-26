package Sorting;

public class Selection_Sort {
    public static void main(String args[]) {
        int arr[] = { 23, 2, 12, 54, 38 };
        int n = arr.length;
        for (int itr = 0; itr < n; itr++) {
            for (int check = itr + 1; check < n; check++) {
                if (arr[itr] > arr[check]) {
                    int temp = arr[itr];
                    arr[itr] = arr[check];
                    arr[check] = temp;

                }
            }
        }
    }
}
