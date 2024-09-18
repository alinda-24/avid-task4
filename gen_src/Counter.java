import java.util.*;

public class Counter {

    private int value;

    public Counter() {
        this.value = 0;
    }

    // Constructor initializing counter to a specified value
    public Counter(int initialValue) {
        this.value = initialValue;
    }

    // Method to increment the counter by 1
    public void increment() {
        value++;
    }

    // Overloaded method to increment the counter until it reaches a specified maximum
    public void increment(int max) {
        while (value < max) {
            value++;
        }
    }

    // Overriding toString() for meaningful output
    @Override
    public String toString() {
        // TODO: Implement logic and return the appropriate value.
        return "Counter value: " + value;
    }

    public static void main(String[] args) {
        // Example usage
        Counter counter = new Counter();
        counter.increment();
        System.out.println(counter);
        
        Counter counterWithInitial = new Counter(10);
        counterWithInitial.increment(15);
        System.out.println(counterWithInitial);
    }
}