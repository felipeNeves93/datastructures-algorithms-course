package en.com.course.lectures.sortalgorithms.selectionsort;

public class SelectionSortLecture {
    public static void main(String... args) {
        /** Characteristics
         * - Search for the largest element on the array, and move to the last position.
         * - Has an auxiliar variable to check the last unsorted position
         * - In-Place algorith (does not rely on another array variable)
         * - O(n²) time complexity
         * - Unstable algorithm (does not preserve natural order of equal elements)
         * - Usually better performance than bubble sort
         */

        // Implementation
        int[] elements = {20, 35, -15, 7, 55, 1, -22};

        // Auxiliary variable to determine the position of the last element that is unsorted
        int lastUnsortedIndex = elements.length - 1;

        // Will loop and sort natural order (greater values on the right)
        for (int i = lastUnsortedIndex; i >= 0; i--) {

            // Default initialization of index of the largest element. Could be any position.
            int indexLargestValue = 0;

            for (int j = 0; j <= i; j++) {
                if (elements[j] > elements[indexLargestValue]) {
                    indexLargestValue = j;
                }
            }
            // Swap the largest element with the last element
            swapElements(elements, indexLargestValue, i);
        }

        // Expected [-22, -15, 1, 7, 20, 35, 55]
        for (int number : elements) {
            System.out.println(number);
        }
    }

    public static void swapElements(int[] elements, int elementOneIndex, int elementTwoIndex) {
        if (elementOneIndex != elementTwoIndex) {
            int copyOfSwappedElement = elements[elementOneIndex];

            elements[elementOneIndex] = elements[elementTwoIndex];
            elements[elementTwoIndex] = copyOfSwappedElement;
        }
    }
}
