public class Loops {

    public void printOddNumbersUpTo(int n) {
        int number = 1;
        while (number <= n) {
            // TODO: Implement logic to print odd numbers
            number += 2;
        }
    }

    /**
     * Calculates the sum of all even numbers up to max (inclusive).
     * Returns 0 if max is less than 0.
     * @param max the maximum number to include in the sum.
     * @return the sum of all even numbers from 0 to max.
     */
    public int sumEvensUpTo(int max) {
        if (max < 0) {
            return 0;
        }

        int sum = 0;
        int number = 0;
        while (number <= max) {
            // TODO: Implement logic to sum even numbers
            number += 2;
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
        for (int i = 1; i <= n; i++) {
            // TODO: Implement logic for factorial calculation
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
        for (int i = 0; i <= max; i++) {
            // TODO: Implement logic to sum squares of numbers
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
        for (int i = 1; i <= n; i++) {
            // TODO: Implement logic for calculating the harmonic sum
        }

        return sum;
    }
}