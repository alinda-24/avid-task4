# Building Blocks of Java Programming

Computers excel by performing repetitive tasks without error or exhaustion, unlike humans who could quickly grow tired of monotony. This ability is harnessed through concepts such as _iteration_ or _looping_. This task will guide you through various programming constructs in Java, enabling you to implement complex logic efficiently.

### 👩‍🏫 Instructions

For instructions on how to complete and submit this assignment, please see the [assignment section of the course instructions](https://gits-15.sys.kth.se/inda-24/course-instructions#assignments).

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1kcsmcuBBu4Jr3O_r6eNP6IFrP6DEITDWeRS5_7rtV30/edit#slide=id.p)
- Study the modules:
  - [Boolean Expressions and Operators](https://qbl.sys.kth.se/sections/dd1337_programming/page/boolean_expressions)
  - [Introduction to Java Loops](https://qbl.sys.kth.se/sections/dd1337_programming/page/java_loops)

### ✅ Learning Goals

By the end of this task, you should be proficient in:

- Utilizing `boolean` expressions and logical operators
- Implementing the `while` and `for` loops
- Employing JShell to experiment with snippets and debug your code
- Understanding and applying function overloading

### 🚨 Troubleshooting Guide

If you encounter issues while working on this task:

1. Check this week’s [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues). Your concern might have already been addressed.
2. If your issue isn't listed, post a new question by creating a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new), starting the title with "Task _x_: _summary of problem here_".
3. Attend the [weekly lab](https://queue.csc.kth.se/Queue/INDA) for direct assistance from a TA. Refer to your schedule for timings.

### 🏛 Assignment

This assignment combines multiple Java concepts including conditional logic and looping. You will additionally engage with input validation and function overloading, ultimately designing an interactive Java application.

#### Exercise 5.1 — Boolean Expressions and Operators

Start with boolean basics before you delve into loops.

- Using JShell, evaluate and complete the following table found in [`docs/README.md`](docs/README.md):

  | Boolean expression              | Value    |
  | ------------------------------- | -------- |
  | `5 == 5`                        | `true`   |
  | `3 > 8`                         |          |
  | `!false`                        |          |
  | `(6 <= 10) && (10 > 5)`         |          |
  | `!(3 == 4) || (2 != 2)`         |          |

> **Assistant's tip:** JShell is a great way to test Java expressions without the need to run a full program. Open your terminal and type `jshell` to start testing expressions like `5 == 5`.

#### Exercise 5.2 — Implementing While and For Loops

Create a new Java file named `LoopingTask.java` in your `src` directory and implement the following exercises.

##### Exercise 5.2.1 — While Loop

Add the following method to your file:
```java
public void printEvenNumbersUpTo(int max) {
    // Use a while loop to print even numbers from 0 to max
}
```
This method should print all even numbers from 0 up to the specified `max` parameter using a `while` loop.

##### Exercise 5.2.2 — For Loop

Now, add this method:
```java
public int factorial(int number) {
    // Use a for loop to return factorial of the given number
}
```
Calculate and return the factorial of a number using a `for` loop. Remember, factorial of 0 and 1 is 1. If the input is negative, return 0.

#### Exercise 5.3 — Function Overloading

Within the same Java file, demonstrate function overloading by implementing:

```java
public int multiply(int a, int b) {
    // Return the product of a and b
}
```
```java
public double multiply(double a, double b) {
    // Return the product of a and b as a double
}
```
Both methods should perform multiplication, but they must demonstrate overloading by using different parameter types.

#### Exercise 5.4 — Practical Application

You will develop a program that simulates a counter class in Java, with attributes to track its current value and increment it under certain conditions.

##### Exercise 5.4.1 — Class and Constructors

Create a class `Counter` inside `Counter.java` in your `src` and declare the necessary fields.

- Implement two constructors:
  - A default constructor initializing the counter to 0.
  - Another constructor initializing to a specified value.

##### Exercise 5.4.2 — Using Loops with Class

Add methods to this class:

- `public void increment()`: This should increment the counter by 1.
- `public void increment(int max)`: This function overloads the previous method, using a loop to repeatedly call `increment()` until the counter reaches `max`.

##### Exercise 5.4.3 — Presentation and Validation

Provide a string representation of your Counter class using `toString()`. Ensure your counter does not go negative—protect it using boolean logic in your increments.

### ❎ Checklist

- [ ] Filled out `docs/README.md` for boolean expressions.
- [ ] Implemented `printEvenNumbersUpTo(int max)` with a `while` loop.
- [ ] Implemented `factorial(int number)` using a `for` loop.
- [ ] Demonstrated function overloading with `multiply()` methods.
- [ ] Created `Counter.java` with correct constructors and methods.
- [ ] Implemented both `increment()` methods.
- [ ] Ensured `Counter` toString method is overridden for meaningful output.

Remember to thoroughly test your code using both JShell for quick checks and a Java IDE for comprehensive testing. Happy coding!