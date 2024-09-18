package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class CounterTest {

    private Counter counter;

    @Before
    public void setUp() {
        counter = new Counter();
    }

    @Test
    public void defaultConstructorInitializesValueToZero() {
        assertEquals("Counter value: 0", counter.toString());
    }

    @Test
    public void constructorWithInitialValueSetsCorrectValue() {
        counter = new Counter(5);
        assertEquals("Counter value: 5", counter.toString());
    }

    @Test
    public void constructorDoesNotAllowNegativeValues() {
        counter = new Counter(-3);
        assertEquals("Counter value: 0", counter.toString());
    }

    @Test
    public void incrementIncrementsValueByOne() {
        counter.increment();
        assertEquals("Counter value: 1", counter.toString());
    }

    @Test
    public void incrementWithMaxStopsAtMax() {
        counter.increment(5);
        assertEquals("Counter value: 5", counter.toString());
    }
}

// LoopsTest.java

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

