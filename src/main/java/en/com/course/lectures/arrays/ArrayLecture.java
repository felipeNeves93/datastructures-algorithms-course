package en.com.course.lectures.arrays;

public class ArrayLecture {

    public static void main(String... args) {
        /** Advantages
         * - Knowing the index, the number of retrieval steps will always be the same
         * - O(1) for insert, update, delete and retrieve an element of an index
         **/

        /** Disavantages
         * Linear time for retrieving operations based on the size of the array
         * O(n)
         *
         * Not a volatile data structure. If we need to add a new element to the end of the array,
         * we have to declare a new array with capacity to store the new values, and copy the old ones
         * to this new variable.
         */

        /**
         *  If we don't know where the index is, in the worst case scenario, we have to iterate
         *  all over the array to find the value. In the following example, we had to iterate 7 times
         *  to find the number we want. O(n) time complexity.
         */

        int[] arrayOfSevenElements = new int[7];

        arrayOfSevenElements[0] = 1;
        arrayOfSevenElements[1] = 2;
        arrayOfSevenElements[2] = 3;
        arrayOfSevenElements[3] = 4;
        arrayOfSevenElements[4] = 5;
        arrayOfSevenElements[5] = 6;
        arrayOfSevenElements[6] = 7;

        int searchNumber = 7;
        int indexOfElement = -1;

        for (int i = 0; i < arrayOfSevenElements.length; i++) {
            if (arrayOfSevenElements[i] == searchNumber) {
                indexOfElement = i;
                break;
            }
        }

        // The output should be 6
        System.out.println(indexOfElement);
    }
}
