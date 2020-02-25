package en.com.course.lectures.sortalgorithms.quicksort;

/**
 * - Divide and conquer algorith
 * - It's a recursive algorithm
 * - Uses a pivot element to partition the array into two parts
 * - Elements that are lesser than the pivot go to its left, greater to the right
 * - Pivot will then be in its correct sorted position
 * - After each step, the proccess will be repeated for the left and right array.
 * - All elements will eventually be pivot, so, every element will be in its correct sorted position
 * - As previously did on merge sort, the array will be partitioned in series of 1-element arrays
 * - Does this in-place (does not need to create any auxiliary arrays, unlike Merge Sort)
 * - Alternate between left to right and right to left on iterations.
 * - Time complexity of O(nlogn) - base 2
 * - Unstable algorithm
 */
public class QuickSortLecture {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);

        for (int index = 0; index < intArray.length; index++) {
            System.out.println(intArray[index]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        // check if it is a one element array. case it is, do nothing.
        if (end - start < 2) {
            return;
        }

        // Checks where the pivot index will be after partition in sorted array.
        // Based on this position, everything to the left will be smaller, and to the right greater
        int pivotIndex = partition(input, start, end);

        // Do the same thing with the left and right array using recursion

        // Will deal with the left sub-array recursevly
        quickSort(input, start, pivotIndex);

        // Will deal with the right sub-array recursevly
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];

        // Auxiliary variables to do the traversal. i will deal with left elements. j with right elements.
        // It will stop when i and j cross each other.
        int i = start;
        int j = end;

        while (i < j) {

            //empty loop body
            while (i < j && input[--j] >= pivot) ;

            if (i < j) {
                input[i] = input[j];
            }

            // empty loop body
            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }

        // After finishing the traversing, the value of the index j is going to be where the pivot element will be inserted.
        input[j] = pivot;
        return j;
    }


}
