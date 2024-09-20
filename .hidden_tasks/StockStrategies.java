public class StockStrategies {

    // Exercise 1.1: Boolean Expressions Simplified
    // | Boolean expression         | Value   |
    // | -------------------------- | ------- |
    // | `5 == 10`                  | false   |
    // | `3 > 8`                    | false   |
    // | `13 == 13`                 | true    |
    // | `9 <= 9`                   | true    |
    // | `45 >= 12`                 | true    |
    // | `true && false`            | false   |
    // | `(3 != 3) || (4 == 4)`     | true    |

    // Exercise 1.2: Market Signals
    /**
     * Determines if the stock market is bullish by checking if stock prices are 
     * consecutively increasing.
     * 
     * @param stockPrices an array of stock prices
     * @return true if the market is bullish (prices are consecutively increasing), 
     *         false otherwise
     */
    public boolean isMarketBullish(double[] stockPrices) {
        int index = 0;
        while (index < stockPrices.length - 1) {
            if (stockPrices[index] >= stockPrices[index + 1]) {
                return false;
            }
            index++;
        }
        return true;
    }

    // Exercise 1.3: Investment Horizon
    /**
     * Calculates the total investment value after a specified number of years 
     * with a constant annual return.
     * 
     * @param initialInvestment the initial amount invested
     * @param annualReturn the annual return rate (as a decimal)
     * @param years the number of years for the investment
     * @return the sum of investments after the specified number of years
     */
    public double sumInvestments(double initialInvestment, double annualReturn, int years) {
        double total = initialInvestment;
        for (int i = 0; i < years; i++) {
            total *= (1 + annualReturn);
        }
        return total;
    }

    /**
     * Calculates the total investment value applying a different return rate 
     * for each year provided in the array.
     * 
     * @param initialInvestment the initial amount invested
     * @param yearlyReturns an array of return rates (as decimals) for each year
     * @return the sum of investments after applying each annual return
     */
    public double sumInvestments(double initialInvestment, double[] yearlyReturns) {
        double total = initialInvestment;
        for (double returnRate : yearlyReturns) {
            total *= (1 + returnRate);
        }
        return total;
    }

    // Exercise 1.5: Volatility Analyzer
    /**
     * Computes the standard deviation (volatility) of stock prices.
     * 
     * @param stockPrices an array of stock prices
     * @return the standard deviation of the stock prices
     */
    public double computeVolatility(double[] stockPrices) {
        int n = stockPrices.length;
        
        // Handle edge cases
        if (n <= 1) {
            return 0.0;
        }

        // Calculate the mean
        double mean = 0.0;
        for (double price : stockPrices) {
            mean += price;
        }
        mean /= n;

        // Calculate the variance
        double variance = 0.0;
        for (double price : stockPrices) {
            variance += Math.pow(price - mean, 2);
        }
        variance /= n;

        // Return the standard deviation
        return Math.sqrt(variance);
    }

    public static void main(String[] args) {
        StockStrategies strategies = new StockStrategies();

        // Example test for isMarketBullish
        System.out.println("Is Market Bullish: " 
            + strategies.isMarketBullish(new double[] { 100.0, 102.5, 103.0, 105.5 }));

        // Example test for sumInvestments
        System.out.println("Sum Investments (Fixed Rate): " 
            + strategies.sumInvestments(1000.0, 0.05, 10));

        System.out.println("Sum Investments (Varied Rates): " 
            + strategies.sumInvestments(1000.0, new double[] { 0.04, 0.05, 0.03, 0.06, 0.02 }));

        // Example test for computeVolatility
        System.out.println("Volatility: " 
            + strategies.computeVolatility(new double[] { 100.0, 102.5, 98.0, 105.5, 110.0 }));
    }
}