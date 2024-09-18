# 📚 Comprehensive Java Exercise: Exploring Boolean Expressions, Loops, and Function Overloading

Computers excel at performing repetitive tasks with precision. If you were asked to count to 10,000, it might be tedious and prone to errors, but a computer can do it perfectly every time. This concept of repeating actions is known as _iteration_ or _looping_. Today, we will explore different looping mechanisms in Java and how they interplay with boolean expressions and function overloading.

### 👨‍🏫 Instructions

For instructions on how to complete and submit the assignment, please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-24/course-instructions#assignments).

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1kcsmcuBBu4Jr3O_r6eNP6IFrP6DEITDWeRS5_7rtV30/edit#slide=id.p).
- Read and answer questions in:
  - [Module 5: Looping with for-each](https://qbl.sys.kth.se/sections/dd1337_programming/page/looping_with_foreach)
  - [Module 6: Iteration](https://qbl.sys.kth.se/sections/dd1337_programming/page/iteration__continued)

### ✅ Learning Goals

This week's learning objectives are:

- Understanding `boolean` expressions and operators
- Efficient use of `while` loops
- Mastery of `for` loops
- Using JShell to try your Java program
- Grasping Function overloading

### 🚨 Troubleshooting Guide

If you have any questions or issues, take these steps:

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues) to see if others are experiencing similar problems.
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) with a descriptive title beginning with "Task _x_: _summary of problem here_".
3. Seek help from a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA).

Discuss with your course mates, but **do not share answers**. If using AI services to understand concepts, **do not submit AI-generated solutions**. Be responsible for your code understanding and explanation.

### 🏛 Assignment

Before implementing loops in Java, it’s pivotal to grasp how to specify the loop stopping condition, usually determined by evaluating _boolean expressions_. Here's a practical exploration:

<details>
<summary> 📚 Boolean Expressions and Operators </summary>

A [boolean value](https://en.wikipedia.org/wiki/Boolean_data_type) is either true or false. Similarly, a [boolean expression](https://en.wikipedia.org/wiki/Boolean_expression) evaluates to true or false.

In Java, `boolean` is one of the eight [primitive types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html). It can have the value `true` or `false`.

Example definitions in Java:
```java
boolean theCapitalOfMozambiqueIsMaputo = true;
boolean twoEqualsFive = false;
```

Key boolean operators are `&&` (and), `||` (or), and `!` (not).

Just like arithmetic, parentheses can influence evaluation order. For example, `true || (true && false)` is `true`, whereas `(true || true) && false` is `false`.

</details>

#### Exercise 1.1 – Boolean Expressions

In [`docs/README.md`](docs/README.md), fill the boolean value for each expression:

| Boolean expression | Value   |
| ------------------ | ------- |
| `2 > 5`            |         |
| `11 == 11`         |         |
| `7 <= 9`           |         |
| `42 >= 7`          |         |
| `false == true`    |         |

#### Exercise 1.2 – Boolean Operators

Fill in the table in [`docs/README.md`](docs/README.md):

| Boolean expression   | Value |
| -------------------- | ----- |
| `2 == 3 && 2 == 2`   |       |
| `2 == 3 || 2 == 2`   |       |
| `!true`              |       |
| `!false`             |       |

> **Assistant's Tip:** Use [JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm) for evaluating Java expressions like `2 == 5`.

#### Exercise 2.1 – The `while` Loop

Create `Loops.java` in `src`. Add a method:

```java
public void printOddNumbersUpTo(int n)
```

This uses a `while` loop to print all odd numbers up to `n`.

<details>
<summary> 📘 Understanding the `while` loop</summary>

The `while` loop is fundamental, continually executing while a condition remains true:

```java
int count = 0;
while (count < 5) {
    count += 1;
}
```
Predict the final `count` and test to confirm your intuition.

</details>

#### Exercise 2.2 – Summing with a `while` loop

Add to `Loops.java`:

```java
public int sumEvensUpTo(int max)
```

This calculates the sum of even numbers from `0` to `max`, inclusive, return `0` if `max < 0`.

#### Exercise 2.3 – Using `for` Loops

Add to `Loops.java`:

```java
public int factorial(int n)
```

Use a `for` loop to compute and return the factorial of `n`.

<details>
<summary> 📘 Understanding the `for` loop</summary>

A `for` loop condenses loop creation:

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

More compact than its `while` loop equivalent:

```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i += 1;
}
```

</details>

#### Exercise 2.4 – Expanding Functions

Create additional methods in `Loops.java`:

```java
public int sumSquaresUpTo(int max)
public double calculateHarmonicSum(int n)
```

Implement these with loops per the mathematical summations depicted.

#### Exercise 3.1 – Time Implementation

Construct `Clock.java` in `src`. Fields should track hours, minutes, and seconds, with appropriate privacy and public getter methods using camelCase.

#### Exercise 3.2 – Valid Setter Methods

Introduce validating setters: `setHours`, `setMinutes`, `setSeconds` ensuring valid inputs (hours: 1-12, minutes/seconds: 0-59).

#### Exercise 3.3 – Constructors with Overloading

Implement overloaded constructors:

```java
public Clock()
public Clock(int hours, int minutes, int seconds)
```
Leverage setters for validating inputs.

#### Exercise 3.4 – Override toString

Override `toString` in `Clock` to format time as `HH:MM:SS`. Utilize `String.format`.

#### Exercise 3.5 – Adding a `tick` Method

Implement `public void tick()` in `Clock.java` to increment seconds, cascading to minutes and hours as necessary.

#### Exercise 3.6 – Expanding `tick` Method

Enhance `tick` with:

```java
public void tick(int seconds)
```

A loop (your choice of `for` or `while`) to increment time by specified seconds, using `tick()` method gradually.

### ❎ Checklist

1. [ ] Complete boolean exercises in `docs`.
2. [ ] Implement `printOddNumbersUpTo(int n)` with a `while` loop.
3. [ ] Implement `sumEvensUpTo(int max)` with a `while` loop.
4. [ ] Implement `factorial(int n)` with a `for` loop.
5. [ ] Implement extended functions with loops in `Loops.java`.
6. [ ] Construct `Clock` class and include fields with accessors.
7. [ ] Validate inputs through setter methods in `Clock`.
8. [ ] Add constructors and use overloading intelligently in `Clock`.
9. [ ] Override `toString` for `Clock` to represent time correctly.
10. [ ] Implement `tick` methods in `Clock` to adjust time accurately.

Tackle each task carefully, utilizing concepts like `boolean` expressions, loops, and overloading, refining your Java skills!