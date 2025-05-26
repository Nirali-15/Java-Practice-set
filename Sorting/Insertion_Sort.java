package Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];// Element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift element to the right
                j--;
            }

            arr[j + 1] = key;// Insert the key at correct position
        }

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
