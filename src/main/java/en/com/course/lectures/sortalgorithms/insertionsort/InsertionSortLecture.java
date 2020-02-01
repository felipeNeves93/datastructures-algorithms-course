package en.com.course.lectures.sortalgorithms.insertionsort;

public class InsertionSortLecture {
    /**
     * Characteristics
     * - The sorted partition begins from left to right
     * - Index start at 0 to traverse the unsorted partition from rigt to left
     * - Compare each element from the unsorted partition with each element from the sorted partition.
     * Until finds one that is lower than he, or reach the begining of the sorted partition.
     * - When we find an element that is lower than the unsorted element, we don't have the need to
     * traverse the remaining elements, because all the lower elements will be on the left.
     * - In-place algorithm
     * - Stable algorithm
     * - O(n²) time complexity
     */

    public static void main(String... args) {
        int[] elements = {20, 35, -15, 7, 55, 1, -22};

        // It will starts at the second element, because the first is considered to be part of the sorted partition.
        for (int initialUnsortedIndex = 1; initialUnsortedIndex < elements.length; initialUnsortedIndex++) {
            int unsortedElement = elements[initialUnsortedIndex];

            // It will traverse the sorted partition, shifting the grater elements to the right
            int lastSortedIndex;

            for (lastSortedIndex = initialUnsortedIndex; lastSortedIndex > 0 && elements[lastSortedIndex - 1] > unsortedElement;
                 lastSortedIndex--) {
                int sortedElement = elements[lastSortedIndex - 1];

                // Create a copy of the current sorted element to the next position
                elements[lastSortedIndex] = sortedElement;
            }

            elements[lastSortedIndex] = unsortedElement;
        }

        // The array should be sorted. The elements should be following this order: -22, -15, 1, 7, 20, 35, 55
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
}
