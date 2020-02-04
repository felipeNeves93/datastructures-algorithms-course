package en.com.course.lectures.sortalgorithms.shellsort;

public class ShellSortLecture {

    /**
     * Characteristics
     * - Is a variation of Insertion Sort
     * - Starts using a larger gap value
     * - Goal of reducing the gap as the algorithm run, so the amount required of shifgting is diminished
     * - After the run through the array, divide the gap by 2 until reaches 1
     * - Finishing all the runs, and transforming the array in a partially sorted array, becomes Insertion sort
     * - This is done because the time complexity of the insertion sort on a partially sorted array is O(n)
     * - Gap is calculated using the Knuth sequence (3^k-1)/2 where k is the length of the array
     * - The Worst case time complexity is O(n²), but depends the sort.
     * - Unstable algorithm (doest not respect duplicate elements order) because of the gap
     * - Could be used to improve bubble sort also+
     */
    public static void main(String... args) {
        int[] elements = {20, 35, -15, 7, 55, 1, -22};

        // Declares the value of the gap that is going to be utilized to partially sort the array.(Not using the Knuth sequence)
        // After each iteration we are going to divide the gap by 2
        for (int gap = elements.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < elements.length; i++) {
                int newElement = elements[i];

                // Variable to do the traversing
                int j = i;

                while (j >= gap && elements[j - gap] > newElement) {
                    elements[j] = elements[j - gap];
                    j -= gap;
                }
                elements[j] = newElement;
            }
        }

        // The array should be sorted. The elements should be following this order: -22, -15, 1, 7, 20, 35, 55
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }


    }
}
