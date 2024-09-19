# 🎮 Simple Game Development with Java

Computers are fantastic tools for performing repetitive tasks with precision and consistency. One of the exciting areas of computer programming is game development, where we create engaging and interactive applications. This week, we will delve into building a simple game application in Java. We'll focus on player movement, a scoring system, and enemy interactions. Throughout this task, you will employ techniques such as looping, conditionals, and method overloading. Let's embark on this journey of crafting a game using fundamental programming concepts.

### 📝 Preparation

- Review these resources to refresh necessary concepts:
  - [Java Flow Control](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
  - [Looping in Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/loops.html)
  - [Boolean Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)

### ✅ Learning Goals

This task will help you achieve the following learning goals:

- Understand and apply `boolean` expressions and operators.
- Utilize `while` loops for repeating actions under specific conditions.
- Implement `for` loops for definite iteration.
- Test your Java code using JShell for quick feedback.
- Practice function overloading to create versatile methods.

### 🚨 Troubleshooting Guide

If you run into issues, follow these steps:

1. Review the [discussions](https://gits-15.sys.kth.se/inda-24/help/issues) for common questions or problems.
2. If your problem isn't listed, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) with a descriptive title.
3. Seek help from a TA during the weekly lab sessions. Refer to your schedule for timing.

**Collaborate wisely**: Discuss with classmates but do not share solutions directly. Use AI tools for understanding, but ensure you can explain your solution if asked.

### 🏛 Assignment

The task requires you to create a basic game with player movement, a scoring system, and enemy interactions. We will break it down into manageable exercises focusing on iteration techniques and other principles you've recently learned.

#### Exercise 1: Setting Up the Project

1. Create a new Java file named `Game.java` in your project directory.
2. Create a class called `Game` with the following fields:
   - `int playerX, playerY`: representing the player's position.
   - `int score`: the player's score.
   - `int enemyX, enemyY`: representing the enemy's position.
   - `boolean isGameOver`: initially set to `false`, indicating if the game has ended.

#### Exercise 2: Boolean Expressions and Conditional Checks

Add a method:

```java
public boolean isColliding()
```

- This method checks if the player's position matches the enemy's position, returning `true` if they collide. Use boolean expressions to evaluate the condition.

#### Exercise 3: Player Movement Using `while` Loop

Add a method:

```java
public void movePlayer(char direction)
```

- Use a `while` loop to ask the player to enter a direction (U for Up, D for Down, L for Left, R for Right) until it is a valid choice.
- Update the player’s position based on the input using boolean operators.

#### Exercise 4: Scoring System with a `while` Loop

Incorporate a loop in your game loop logic:

```java
public void gameLoop()
```

- Use a `while` loop that continues running the game until `isGameOver` is `true`.
- Increment the score every time the player moves.
- Check for collisions using `isColliding()` and end the game if a collision is detected, setting `isGameOver` to `true`.

#### Exercise 5: Enemy Movement Using `for` Loop

Add a method:

```java
public void moveEnemy()
```

- Use a `for` loop to randomly adjust the enemy’s position a limited number of times per game loop iteration.

#### Exercise 6: Overloaded Methods for Player Actions

Add overloaded methods:

```java
public void performAction(String actionName)
public void performAction(String actionName, int intensity)
```

- First method triggers a simple player action based on a string input.
- Second method modifies the action's effectiveness based on the intensity provided.

#### Exercise 7: Testing with JShell

- Use JShell to experiment with your `Game` class, testing methods interactively. JShell allows you to evaluate Java expressions and receive immediate feedback.

```bash
jshell Game.java
Game myGame = new Game();
myGame.movePlayer('U');
myGame.gameLoop();
```

> **Tip**: Method overloading allows different implementations based on parameter types and counts. Use it creatively for flexible game mechanics.

#### Exercise 8: Document Your Game Progress

- Maintain a simple game log in your file, using `System.out.println()` to track actions, score changes, and collision notifications during the game loop.

By the end of this assignment, you'll have created a basic interactive game with structured logic patterns. Feel free to extend the game with additional features and complexity to further enhance your understanding. Enjoy the process of developing your game! 🎮