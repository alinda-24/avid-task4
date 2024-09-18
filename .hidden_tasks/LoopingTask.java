public class LoopingTask {
    
    // Method to print even numbers up to a specified maximum using a while loop
    public void printEvenNumbersUpTo(int max) {
        int i = 0;
        while (i <= max) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    // Method to calculate factorial of a number using a for loop
    public int factorial(int number) {
        if (number < 0) return 0; // Return 0 for negative inputs
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Method demonstrating function overloading - integer multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method demonstrating function overloading - double multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        LoopingTask lt = new LoopingTask();
        lt.printEvenNumbersUpTo(10);
        System.out.println(lt.factorial(5));
        System.out.println(lt.multiply(3, 4));
        System.out.println(lt.multiply(2.5, 4.0));
    }
}