public class Loops {

    /**
     * Print all multiples of five between 0 and 50.
     */
    public void printMultiplesOfFive() {
        int number = 0;
        while (number <= 50) {
            if (number % 5 == 0) {
                System.out.println(number);
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
            return 0;
        }
        int sum = 0;
        int number = 0;
        while (number <= max) {
            if (number % 2 == 0) {
                sum += number;
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
            return 1; // For negative numbers, return 1 as a general case
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
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
            return 1;
        }
        int product = 1;
        for (int i = start; i <= end; i++) {
            product *= i;
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
            return 1;
        }
        int product = 1;
        for (int i = start; i <= end; i += step) {
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        // Example to test methods
        Loops loops = new Loops();

        System.out.println("Multiples of Five:");
        loops.printMultiplesOfFive();

        System.out.println("\nSum of Even Numbers up to 10: " + loops.sumEvenNumbers(10));
        
        System.out.println("\nFactorial of 5: " + loops.factorial(5));

        System.out.println("\nMultiply Series from 2 to 5: " + loops.multiplySeries(2, 5));
        System.out.println("Multiply Series from 2 to 10 with step 3: " + loops.multiplySeries(2, 10, 3));
    }
}