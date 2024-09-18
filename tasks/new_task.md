# Java Control Flow and Function Overloading

A significant reason why computers are incredibly useful is their ability to repeatedly perform operations accurately and tirelessly. While humans may get weary of repetitive tasks, computers execute them seamlessly. This is a cornerstone of programming known as _"iteration"_ or _"looping"_. This week, we will delve into Java programming, focusing specifically on control flow statements and function overloading.

### 👩‍🏫 Instructions

For instructions on how to begin and submit your assignment, please refer to the [course instructions section](https://gits-15.sys.kth.se/inda-24/course-instructions#assignments).

### 📝 Preparation

- Revisit the relevant [lecture slides](https://docs.google.com/presentation/d/1kcsmcuBBu4Jr3O_r6eNP6IFrP6DEITDWeRS5_7rtV30/edit#slide=id.p).
- Explore:
  - [Boolean Expressions and Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
  - [Java Loops](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html)
  - [JShell Introduction](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm)

### ✅ Learning Goals

This week's learning goals include:

* Understanding and implementing `boolean` expressions and operators
* Applying `while` loops and `for` loops for iteration
* Using JShell to test Java programs
* Implementing function overloading in Java

### 🚨 Troubleshooting Guide

If you encounter issues or have questions, follow this procedure:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues). 
2. If your problem isn’t listed, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) with a descriptive title like "Task _x_: _brief issue summary_".
3. Consult a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Make sure to know your lab schedule.

Discussion with peers is encouraged, but **do not share solutions!** Similarly, AI can be great for explanations but **do not submit AI-generated solutions**. You must independently create and be able to explain your solutions.

### 🏛 Assignment

In this assignment, you will work through a series of exercises to deepen your understanding of boolean logic, loops, and function overloading.

<details>
<summary> 📚 Boolean Values, Expressions, and Operators </summary>

A [boolean value](https://en.wikipedia.org/wiki/Boolean_data_type) is either `true` or `false`. Similarly, a [boolean expression](https://en.wikipedia.org/wiki/Boolean_expression) evaluates to either `true` or `false`. Java provides boolean operators such as `&&` (and), `||` (or), and `!` (not) to form complex expressions. Parentheses can be used to change the evaluation order, like in arithmetic.

Example:
```java
boolean isEven = (number % 2 == 0);
boolean isInRange = (number >= 1 && number <= 10);
```

</details>

#### Exercise 4.1.1 -- Boolean Expressions

In [`docs/README.md`](docs/README.md), fill in the boolean value each expression evaluates to:

| Boolean expression | Value   |
| ------------------ | ------- |
| `2 == 5`           | `false` |
| `5 != 5`           |         |
| `15 > 10`          |         |
| `7 <= 7`           |         |
| `!false`           |         |

#### Exercise 4.2.1 -- The `while` Loop

Create a file named `Loops.java` in your `src` folder. Add this method:

```java
public void printMultiplesOfFive() 
```

This method should use a `while` loop to print all multiples of five between 0 and 50.

<details>
<summary> 📚 The `while` Loop </summary>

A `while`-loop keeps executing statements while a condition is `true`. 

Example:
```java
int count = 0;
while (count < 5) {
    System.out.println(count);
    count++;
}
```
</details>

#### Exercise 4.2.2 -- Summation with a `while` Loop

Implement the method:

```java
public int sumEvenNumbers(int max)
```

This method should sum all even numbers from 0 to `max` inclusively using a `while` loop. Return the total sum. If max is less than 0, return 0.

#### Exercise 4.2.3 -- The `for` Loop

Add a method to `Loops.java`:

```java
public int factorial(int n)
```

This method should use a `for` loop to compute the factorial of a non-negative integer `n`. Factorial `n!` is the product of all positive integers up to `n`. Return the result. If `n` is negative, return 1 (by definition, 0! is 1).

<details>
<summary> 📚 The `for` Loop </summary>

A `for`-loop is useful for iterating a set number of times. 

Example:
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```
</details>

#### Exercise 4.3.1 -- Function Overloading

Add methods to `Loops.java`:

```java
public int multiplySeries(int start, int end)
public int multiplySeries(int start, int end, int step)
```

The first method calculates the product of all numbers from `start` to `end` (inclusive) using a `for` loop. If `start > end` return 1. The second method uses the `step` parameter as the increment between numbers in the series. Demonstrate the concept of function overloading with these two methods.

### ❎ Checklist

- [ ] Complete boolean expression exercises in `docs/README.md`.
- [ ] Implement `printMultiplesOfFive()` using a `while` loop.
- [ ] Implement `sumEvenNumbers(int max)` using a `while` loop.
- [ ] Implement `factorial(int n)` using a `for` loop.
- [ ] Implement the overloaded `multiplySeries` methods using a `for` loop.

### Using JShell

To test your Java code snippets quickly, use JShell. Launch JShell, input your Java code, and immediately check output or expressions.

Example:
```bash
jshell
int x = 5 * 5;
x >= 10  // Check if true
```

By completing these exercises, you'll gain proficiency in understanding the nuances of Java's control flow mechanisms and the power of function overloading.