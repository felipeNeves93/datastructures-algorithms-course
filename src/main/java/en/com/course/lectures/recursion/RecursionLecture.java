package en.com.course.lectures.recursion;

public class RecursionLecture {

    public static void main(String... args) {
        /**
         On this lecture, lets see the different implementations of a function to calculate
         the factorial of a number. One using a classic for loop, and another using recursion
         **/
        int factorialRecursiveResult = recursiveFactorial(4);
        int factorialForResult = iterativeFactorial(4);

        System.out.println(factorialRecursiveResult);
        System.out.println(factorialForResult);

    }

    // Utilizes the following formula to calculate fatoriaal = n! = n*(n-1)!
    // Each time the method is called within the recursion is put in a stack
    // Iteration is faster and preferable over recursion.
    // Recursion is easier to understand
    public static int recursiveFactorial(int number) {
        if (number == 0) {
            return 1;
        }

        return number * recursiveFactorial(number - 1);
    }

    // Implementation using classical for loop
    public static int iterativeFactorial(int number) {
        // The factorial of 0 is always 1
        if (number == 0) {
            return 1;
        }
        int factorial = 1;

        for (int index = 1; index <= number; index++) {
            factorial *= index;
        }

        return factorial;
    }


}
