package en.com.course.lectures.sortalgorithms.mergesort;

public class MergeSortLecture {

    /**
     * Characteristics
     * - Not in-place algorithm
     * - Divide and conquer algorithm
     * - Consisted of two phases, Splitting and Merging
     * - Splitting phase is logical. There aren't new arrays.
     * - On the Splitting phase, the array is divided in two arays (unsorted)
     * - The arrays keep getting splitted until they reach only one element.
     * - After the splitting phase is over, we start to merge the arrays into sorted ones
     * - After the first merge, we'll have groups of two elements sorted arrays, and on...
     * - This phase happens until we reach one array with all the sorted elements.
     * - We always merge sibling left/right arrays
     * - O(nlogn) - base 2 time complexity
     * - Stable algorithm
     */
    public static void main(String... args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        for (int index = 0; index < intArray.length; index++) {
            System.out.println(intArray[index]);
        }
    }

    // Going to utilize recursion to split the array into smaller ones.
    public static void mergeSort(int[] input, int startingIndex, int endingIndex) {
        if (endingIndex - startingIndex < 2) {
            return;
        }

        int mid = (startingIndex + endingIndex) / 2;
        // Left part of the array
        mergeSort(input, startingIndex, mid);

        // Right part of the array
        mergeSort(input, mid, endingIndex);

        // Do the merging
        merge(input, startingIndex, mid, endingIndex);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
