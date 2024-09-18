public class Counter {
    private int value;

    // Default constructor initializing counter to 0
    public Counter() {
        this.value = 0;
    }

    // Constructor initializing counter to a specified value
    public Counter(int initialValue) {
        this.value = (initialValue < 0) ? 0 : initialValue;
    }

    // Method to increment the counter by 1
    public void increment() {
        value++;
    }

    // Overloaded method to increment the counter until it reaches a specified maximum
    public void increment(int max) {
        while (value < max) {
            increment();
        }
    }

    // Overriding toString() for meaningful output
    @Override
    public String toString() {
        return "Counter value: " + value;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        System.out.println(counter);
        counter.increment(5);
        System.out.println(counter);
    }
}