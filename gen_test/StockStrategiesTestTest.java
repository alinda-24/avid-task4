package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class StockStrategiesTest {

    private StockStrategies stockStrategies;

    @Before
    public void setUp() {
        stockStrategies = new StockStrategies();
    }

    @Test
    public void testIsMarketBullishWhenPricesAreIncreasing() {
        assertTrue(stockStrategies.isMarketBullish(new double[]{100.0, 101.0, 102.0, 103.0}));
    }

    @Test
    public void testIsMarketBullishWhenPricesAreNotIncreasing() {
        assertFalse(stockStrategies.isMarketBullish(new double[]{100.0, 101.0, 100.0, 103.0}));
    }

    @Test
    public void testIsMarketBullishWithAllEqualPrices() {
        assertFalse(stockStrategies.isMarketBullish(new double[]{100.0, 100.0, 100.0}));
    }

    @Test
    public void testIsMarketBullishWithOnePrice() {
        assertTrue(stockStrategies.isMarketBullish(new double[]{100.0}));
    }

    @Test
    public void testIsMarketBullishWithNoPrices() {
        assertTrue(stockStrategies.isMarketBullish(new double[]{}));
    }

    @Test
    public void testSumInvestmentsFixedRate() {
        assertEquals(1628.89, stockStrategies.sumInvestments(1000.0, 0.05, 10), 0.01);
    }

    @Test
    public void testSumInvestmentsFixedRateZeroYears() {
        assertEquals(1000.0, stockStrategies.sumInvestments(1000.0, 0.05, 0), 0.01);
    }

    @Test
    public void testSumInvestmentsFixedRateZeroInitialInvestment() {
        assertEquals(0.0, stockStrategies.sumInvestments(0.0, 0.05, 10), 0.01);
    }

    @Test(expected = IllegalArgumentException.