package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class LoopsTest {

    private Loops loops;

    @Before
    public void setUp() {
        loops = new Loops();
    }

    @Test
    public void printMultiplesOfFive_outputCorrectMultiples() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        loops.printMultiplesOfFive();
        String[] output = out.toString().trim().split("\n");

        assertEquals(11, output.length);  // 0, 5, 10, ..., 50
        for (int i = 0; i <= 10; i++) {
            assertEquals(Integer.toString(i * 5), output[i]);
        }
    }

    @Test
    public void sumEvenNumbers_withPositiveMax() {
        assertEquals(30, loops.sumEvenNumbers(10)); // 0 + 2 + 4 + 6 + 8 + 10 = 30
    }

    @Test
    public void sumEvenNumbers_withZeroMax() {
        assertEquals(0, loops.sumEvenNumbers(0)); // Only 0 in the sum
    }

    @Test
    public void sumEvenNumbers_withNegativeMax() {
        assertEquals(0, loops.sumEvenNumbers(-5)); // Negative, should not sum
    }

    @Test
    public void factorial_ofNonNegativeNumber() {
        assertEquals(120, loops.factorial(5)); // 5! = 120
    }

    @Test
    public void factorial_ofZero() {
        assertEquals(1, loops.factorial(0)); // 0! is defined as 1
    }

    @Test
    public void factorial_ofNegativeNumber() {
        assertEquals(1, loops.factorial(-4)); // As per spec, return 1 for negative input
    }

    @Test
    public void multiplySeries_normalRange() {
        assertEquals(120, loops.multiplySeries(2, 5)); // 2 * 3 * 4 * 5 = 120
    }

    @Test
    public void multiplySeries_startGreaterThanEnd() {
        assertEquals(1, loops.multiplySeries(5, 2)); // No numbers multiplied, return 1
    }

    @Test
    public void multiplySeries_withStep_normalRange() {
        assertEquals(24, loops.multiplySeries(2, 5, 1)); // 2 * 3 * 4 * 5 = 120
    }

    @Test
    public void multiplySeries_withStep_specificStep() {
        assertEquals(15, loops.multiplySeries(1, 5, 2)); // 1 * 3 * 5 = 15
    }

    @Test
    public void multiplySeries_withStep_startGreaterThanEnd() {
        assertEquals(1, loops.multiplySeries(5, 2, 1)); // No numbers multiplied, return 1
    }

    @Test
    public void multiplySeries_withStep_zeroStep() {
        assertEquals(1, loops.multiplySeries(2, 10, 0)); // Invalid step, return 1
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

