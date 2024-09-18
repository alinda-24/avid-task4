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
    public void printOddNumbersUpToPrintsCorrectly() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        loops.printOddNumbersUpTo(10);
        String[] lines = out.toString().trim().split("\n");

        assertEquals("1", lines[0]);
        assertEquals("3", lines[1]);
        assertEquals("5", lines[2]);
        assertEquals("7", lines[3]);
        assertEquals("9", lines[4]);
    }

    @Test
    public void sumEvensUpToCalculatesCorrectly() {
        assertEquals(30, loops.sumEvensUpTo(10));
        assertEquals(0, loops.sumEvensUpTo(-1));
    }

    @Test
    public void factorialCalculatesCorrectly() {
        assertEquals(1, loops.factorial(0));
        assertEquals(1, loops.factorial(1));
        assertEquals(120, loops.factorial(5));
    }

    @Test
    public void sumSquaresUpToCalculatesCorrectly() {
        assertEquals(14, loops.sumSquaresUpTo(3));
        assertEquals(0, loops.sumSquaresUpTo(0));
    }

    @Test
    public void calculateHarmonicSumCalculatesCorrectly() {
        assertEquals(1.0, loops.calculateHarmonicSum(1), 0.0001);
        assertEquals(1.5, loops.calculateHarmonicSum(2), 0.0001);
    }
}

// HeroGameTest.java

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

