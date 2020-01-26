package en.com.course.lectures.sortalgorithms.bubblesort;

public class BubbleSortLecture {
    public static void main(String... args) {
        /** Characteristics
         *  - Doesn't create auxiliary arrays to sort
         *  - Do the sorting operation on the same array
         *  - Compare the value with the left element, positionating the greater element to
         *  the right
         *  - Has an auxiliary index variable (unsortedPartitionIndex). Starts with (arrayLength -1),
         *  and mark the last element that is sorted, Each complete cycle decreases 1.
         *
         */

        /** Advantages
         *  - Works well for small amount of elements
         *  - In-Place algorithm (does not rely to create variables with the size of
         *  the elements sorting)
         */

        /** Disadvantages
         *  - Performance degrades quickly as number of elements grow.
         *  - O(n²) Quadratic time complexity
         */

        // Implementation

        int[] elements = {20, 35, -15, 7, 55, 1, -22};

        // Auxiliary variable to determine the position of the last element that is unsorted
        int lastUnsortedIndex = elements.length - 1;

        // Will loop and sort natural order (greater values on the right)
        for (int i = lastUnsortedIndex; i > 0; i--) {
            for (int j = 0; j < lastUnsortedIndex; j++) {
                // Compare the value of the element, and swap to right the greater one
                if (elements[j] > elements[j + 1]) {
                    swapElements(elements, j, j + 1);
                }
            }
        }

        // The array should be sorted. The elements should be following this order: -22, -15, 1, 7, 20, 35, 55
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    // Method that is going to be utilized by the algorithm to swap the position of the elements
    public static void swapElements(int[] elements, int elementOneIndex, int elementTwoIndex) {
        if (elementOneIndex != elementTwoIndex) {
            int copyOfSwappedElement = elements[elementOneIndex];

            elements[elementOneIndex] = elements[elementTwoIndex];
            elements[elementTwoIndex] = copyOfSwappedElement;
        }
    }
}
