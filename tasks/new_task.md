# Quant Investing and Function Overloading in Java

Quantitative investing involves the use of complex mathematical models and simulations to make investment decisions. This task will introduce you to some foundational concepts of quant investing using Java programming. Throughout this task, you'll practice using loops, boolean expressions, and function overloading. You'll also try out your Java code using JShell for interactive execution. Let's dive in!

### 📝 Preparation

- Review online resources about [Quantitative Investing](https://www.investopedia.com/quantitative-investment-strategies-4587443) to get an understanding of its basic principles.
- Recap core Java concepts including loops, boolean expressions, and function overloading.
- Watch this [JShell tutorial video](https://www.youtube.com/watch?v=6Ts-nmYoJ8Y) to familiarize yourself with the tool.

### ✅ Learning Goals

This task aims to enhance your skills in:

* Understanding and using `boolean` expressions and operators.
* Implementing `for` and `while` loops.
* Interactive coding in JShell with Java.
* Mastering function overloading by creating diverse methods with the same name but different parameters.

### 🚨 Troubleshooting Guide

If you run into any issues, don't hesitate to:

1. Search for similar problems on this week's [discussion forum](https://gits-15.sys.kth.se/inda-24/help/issues).
2. Post your question if it's not answered on the forum. Use the [New Issue Form](https://gits-15.sys.kth.se/inda-24/help/issues/new) appropriately.
3. Speak to a Teaching Assistant during office hours or during lab sessions. Don't forget to consult the schedule!

Remember, discussing concepts with peers is beneficial, but sharing solutions isn't. Comprehend your solutions thoroughly as you may need to explain them later.

### 🏛 Assignment

Before tackling quantitative investing strategies involving complex algorithms, let's solidify your understanding of boolean expressions, loops, and function overloading. These exercises will prepare you for developing more concrete investment strategies in quantitative finance.

<details>
<summary> 📚 Boolean Values, Expressions and Operators </summary>

A [boolean value](https://en.wikipedia.org/wiki/Boolean_data_type) is either `true` or `false`. A [boolean expression](https://en.wikipedia.org/wiki/Boolean_expression) evaluates to one of these boolean values. You can use boolean operators like `&&` for "and", `||` for "or", and `!` for "not". Just like arithmetic operations, boolean expressions respect precedence rules, but you can use parentheses to ensure specific evaluation orders, such as:

- `true || (true && false)` results in `true`.
- `(true || true) && false` results in `false`.

</details>

#### Exercise 1.1: Boolean Expressions Simplified

Fill in the outcomes of each boolean expression provided below:

| Boolean expression         | Value   |
| -------------------------- | ------- |
| `5 == 10`                  |         |
| `3 > 8`                    |         |
| `13 == 13`                 |         |
| `9 <= 9`                   |         |
| `45 >= 12`                 |         |
| `true && false`            |         |
| `(3 != 3) || (4 == 4)`     |         |

#### Exercise 1.2: Market Signals

Implement a method in `StockStrategies.java` with the following header:

```java
public boolean isMarketBullish(double[] stockPrices)
```

Use a `while` loop and boolean operators to determine if stock prices are consecutively increasing. This method should return `true` if all consecutive prices are in ascending order, otherwise `false`. Here's a quick hint: initialize an index, then loop through the array, comparing each consecutive pair.

#### Exercise 1.3: Investment Horizon

Now, implement a `sumInvestments` method in the same file using:

- A `for` loop that computes the potential investment value for a number of years.
- Function overloading with two methods:
  
```java
public double sumInvestments(double initialInvestment, double annualReturn, int years)
```

- Uses a `for` loop to calculate compound interest: `initialInvestment * (1 + annualReturn) ^ years`.

```java
public double sumInvestments(double initialInvestment, double[] yearlyReturns)
```

- Uses a `for` loop to apply each year's unique return.
  
Apply both methods to test scenarios using JShell.

#### Exercise 1.4: Strategy Test with JShell

Try using the JShell console to evaluate boolean expressions and experiment with newly written methods. 

```bash
jshell StockStrategies.java
isMarketBullish(new double[]{100.0, 102.5, 103.0, 105.5});
sumInvestments(1000.0, 0.05, 10);
sumInvestments(1000.0, new double[]{0.04, 0.05, 0.03, 0.06, 0.02});
```

#### Exercise 1.5: Volatility Analyzer (Conditional Loops)

Add a method called `computeVolatility`:

```java
public double computeVolatility(double[] stockPrices)
```

This should calculate and return the standard deviation of the stock prices. Use a combination of a `for` loop and helper methods for computation, catering for edge cases (like single element array).

🎯 Exercise Challenge: Implement error handling to ensure no divisions by zero and handle arrays with inadequate lengths when computing volatility.

### 🚀 Completion and Push to Mastery

Upon completion of this task, utilize JShell to further validate and understand the dynamic behavior of your functions. You'll find function overloading and loop mastery essential as you delve deeper into quantitative investing strategies! Go ahead, debug in JShell, refine your concepts, and consolidate your knowledge.