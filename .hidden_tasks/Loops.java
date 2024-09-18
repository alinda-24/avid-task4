public class Loops {

    /**
     * Prints all odd numbers up to n (inclusive).
     * @param n the maximum number to print odd numbers up to.
     */
    public void printOddNumbersUpTo(int n) {
        int number = 1; // Start from the first odd number

        // Continue looping while the number is less than or equal to n
        while (number <= n) {
            System.out.println(number);
            number += 2; // Increment by 2 to get the next odd number
        }
    }

    /**
     * Calculates the sum of all even numbers up to max (inclusive).
     * Returns 0 if max is less than 0.
     * @param max the maximum number to include in the sum.
     * @return the sum of all even numbers from 0 to max.
     */
    public int sumEvensUpTo(int max) {
        if (max < 0) return 0; // Return 0 if max is less than 0

        int sum = 0;
        int number = 0;

        // Loop through even numbers and calculate sum
        while (number <= max) {
            sum += number;
            number += 2; // Increment by 2 to get the next even number
        }

        return sum;
    }

    /**
     * Calculates the factorial of n using a for loop.
     * @param n the number to calculate the factorial of.
     * @return the factorial of n.
     */
    public int factorial(int n) {
        int result = 1;

        // Multiply result by each integer up to n
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    /**
     * Calculates the sum of squares up to max (inclusive).
     * @param max the maximum number to calculate the sum of squares up to.
     * @return the sum of squares.
     */
    public int sumSquaresUpTo(int max) {
        int sum = 0;

        // Loop through numbers and add their square to the sum
        for (int i = 0; i <= max; i++) {
            sum += i * i;
        }

        return sum;
    }

    /**
     * Calculates the harmonic sum for numbers 1 to n.
     * @param n the maximum number to include in the harmonic sum.
     * @return the harmonic sum.
     */
    public double calculateHarmonicSum(int n) {
        double sum = 0.0;

        // Loop through numbers and calculate the sum of their reciprocals
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}