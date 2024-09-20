public class StockStrategies {

    /**
     * Determines if the stock market is bullish by checking if stock prices are 
     * consecutively increasing.
     * 
     * @param stockPrices an array of stock prices
     * @return true if the market is bullish (prices are consecutively increasing), 
     *         false otherwise
     */
    public boolean isMarketBullish(double[] stockPrices) {
        // TODO: Implement this method.
    }

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
        // TODO: Implement this method.
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
        // TODO: Implement this method.
    }

    /**
     * Computes the standard deviation (volatility) of stock prices.
     * 
     * @param stockPrices an array of stock prices
     * @return the standard deviation of the stock prices
     */
    public double computeVolatility(double[] stockPrices) {
        // TODO: Implement this method.
    }

    public static void main(String[] args) {
        // TODO: Add test calls for the methods.
    }
}