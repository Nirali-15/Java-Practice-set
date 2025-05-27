package Sorting;

public class Merge_Sort {

    // Merge two sorted subarrays into one
    public static void merge(int[] array, int left, int middle, int right) {
        int sizeLeft = middle - left + 1;
        int sizeRight = right - middle;

        // Temporary arrays
        int[] leftArray = new int[sizeLeft];
        int[] rightArray = new int[sizeRight];

        // Copy data to temp arrays
        for (int index = 0; index < sizeLeft; index++)
            leftArray[index] = array[left + index];
        for (int index = 0; index < sizeRight; index++)
            rightArray[index] = array[middle + 1 + index];

        int indexLeft = 0, indexRight = 0, mergedIndex = left;

        // Merge the temp arrays
        while (indexLeft < sizeLeft && indexRight < sizeRight) {
            if (leftArray[indexLeft] <= rightArray[indexRight]) {
                array[mergedIndex] = leftArray[indexLeft];
                indexLeft++;
            } else {
                array[mergedIndex] = rightArray[indexRight];
                indexRight++;
            }
            mergedIndex++;
        }

        // Copy remaining elements
        while (indexLeft < sizeLeft) {
            array[mergedIndex] = leftArray[indexLeft];
            indexLeft++;
            mergedIndex++;
        }

        while (indexRight < sizeRight) {
            array[mergedIndex] = rightArray[indexRight];
            indexRight++;
            mergedIndex++;
        }
    }

    // Recursive merge sort
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] numbers = { 6, 3, 9, 5, 2, 8 };
        mergeSort(numbers, 0, numbers.length - 1);

        for (int number : numbers)
            System.out.print(number + " ");
    }
}
