package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class LoopingTaskTest {

    private LoopingTask task;

    @Before
    public void setUp() {
        task = new LoopingTask();
    }

    @Test
    public void printEvenNumbersUpToPrintsCorrectly() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        task.printEvenNumbersUpTo(10);
        String[] lines = out.toString().trim().split("\n");

        assertEquals("0", lines[0]);
        assertEquals("2", lines[1]);
        assertEquals("4", lines[2]);
        assertEquals("6", lines[3]);
        assertEquals("8", lines[4]);
        assertEquals("10", lines[5]);
    }

    @Test
    public void factorialCalculatesCorrectly() {
        assertEquals(120, task.factorial(5));
        assertEquals(1, task.factorial(0));
        assertEquals(0, task.factorial(-1));
    }

    @Test
    public void multiplyIntegersWorksCorrectly() {
        assertEquals(12, task.multiply(3, 4));
        assertEquals(0, task.multiply(0, 4));
    }

    @Test
    public void multiplyDoublesWorksCorrectly() {
        assertEquals(10.0, task.multiply(2.5, 4.0), 0.0001);
        assertEquals(0.0, task.multiply(0.0, 4.0), 0.0001);
    }
}