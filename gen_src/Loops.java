import java.util.Scanner;

public class Loops {

    public void printMultiplesOfFive() {
        int number = 0; // Initialize the number variable
        while (number <= 50) {
            if (number % 5 == 0) {
                // TODO: Implement logic to print the number if it is a multiple of 5
            }
            number++;
        }
    }

    /**
     * Sum all even numbers from 0 up to max inclusive.
     * @param max the maximum number to sum up to
     * @return the sum of even numbers
     */
    public int sumEvenNumbers(int max) {
        if (max < 0) {
            // TODO: Implement logic and return the appropriate value.
            return 0; // Placeholder return value
        }
        int sum = 0;
        int number = 0;
        while (number <= max) {
            if (number % 2 == 0) {
                // TODO: Implement logic to add number to sum
            }
            number++;
        }
        return sum;
    }

    /**
     * Compute the factorial of a non-negative integer n.
     * @param n the number to compute the factorial of
     * @return the factorial of n
     */
    public int factorial(int n) {
        if (n < 0) {
            // TODO: Implement logic and return the appropriate value.
            return 0; // Placeholder return value
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            // TODO: Implement logic to calculate factorial
        }
        return result;
    }

    /**
     * Calculate the product of all numbers from start to end inclusive.
     * @param start the starting number of the series
     * @param end the ending number of the series
     * @return the product of the series
     */
    public int multiplySeries(int start, int end) {
        if (start > end) {
            // TODO: Implement logic and return the appropriate value.
            return 0; // Placeholder return value
        }
        int product = 1;
        for (int i = start; i <= end; i++) {
            // TODO: Implement logic to calculate the product
        }
        return product;
    }

    /**
     * Calculate the product of numbers in the series from start to end inclusive, with a specific step.
     * @param start the starting number of the series
     * @param end the ending number of the series
     * @param step the step between numbers in the series
     * @return the product of the series
     */
    public int multiplySeries(int start, int end, int step) {
        if (start > end || step <= 0) {
            // TODO: Implement logic and return the appropriate value.
            return 0; // Placeholder return value
        }
        int product = 1;
        for (int i = start; i <= end; i += step) {
            // TODO: Implement logic to calculate the product
        }
        return product;
    }

    public static void main(String[] args) {
        // Create a Loops object
        Loops loops = new Loops();

        // Example usage or testing of methods
        loops.printMultiplesOfFive();
        System.out.println(loops.sumEvenNumbers(10));
        System.out.println(loops.factorial(5));
        System.out.println(loops.multiplySeries(1, 5));
        System.out.println(loops.multiplySeries(1, 10, 2));
    }
}