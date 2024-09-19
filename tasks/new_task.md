# Developing a Simple Game Application

Creating games not only provides an enjoyable experience for players, but it also serves as a fascinating project for developing programming skills. In this task, we will build a simple console-based game where players can move, score points, and interact with enemies.

### 👩‍🏫 Instructions

For instructions on how to develop and submit the assignment, please refer to the [assignment section of the course instructions](https://gits-15.sys.kth.se/inda-24/course-instructions#assignments).

### 📝 Preparation

- Review [Java Data Types and Expressions](https://www.baeldung.com/java-data-types-primitive#other-data-types).
- Study [Using Loop Constructs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html) in Java.
- Explore [Function Overloading](https://en.wikipedia.org/wiki/Function_overloading) in Java.

### ✅ Learning Goals

This exercise focuses on expanding your understanding of:

- `boolean` expressions and operators.
- `while` loops and `for` loops.
- Using JShell to test Java code and quickly debug.
- Function overloading concepts for flexible coding.

### 🚨 Troubleshooting Guide

If you encounter any issues:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues).
2. If your issue is unique, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new).
3. Consult a TA during [weekly lab hours](https://queue.csc.kth.se/Queue/INDA).

### 🎮 Game Development Task

We'll leverage programming concepts to develop the core mechanics of a simple game application. The game takes place on a grid where players can move, collection of points increases the score, and enemies pose a challenge.

#### Exercise 1: Setting Up Game Environment

* Create a new Java file named `Game.java`. Within this file, define the game environment using a two-dimensional array to represent the grid.
  
* Implement helper methods:
  - **`initializeGrid()`**: Create a grid system.
  - **`printGrid()`**: Visualize the grid state in the console.

#### Exercise 2: Player Movement and Scoring System

* Define variables for player position and score.
  
* Implement player movement using a `while` loop:
  - **`movePlayer(char direction)`**: Use `'W'`, `'A'`, `'S'`, `'D'` for movement. Update coordinates based on input.
  - Keep track of the player's score when they encounter score objects on the grid.
  
* Include `boolean` expressions to enforce movement constraints—such as boundary checks.

#### Exercise 3: Enemy Interaction

* Integrate a basic enemy mechanism. Use `for` loops to iterate over enemy positions.

* Implement:
  - **`moveEnemies()`**: Randomly change enemy positions.
  - **`checkCollisions()`**: Detect if player interacts with an enemy and respond (e.g., reduce score or end game).
  
* Use `boolean` operators to assess player-enemy interactions.

#### Exercise 4: Game Loop using JShell

* Develop the main game loop using `while` loops:
  - Continuously run the game as long as a boolean `isGameRunning` is true.
  
* Test your methods in JShell to ensure accuracy.

#### Exercise 5: Function Overloading for Flexibility

* Overload a scoring function:
  - **`public void updateScore(int points)`**: Update score by a fixed number of points.
  - **`public void updateScore(double multiplier)`**: Update score by multiplying current score with a factor.

* Implement a restart mechanism:
  - **`public void resetGame()` and `public void resetGame(int initialScore)`**: Reset the game state.

### ❎ Checklist

- [ ] Understand `boolean` expressions for conditional checks.
- [ ] Implement and test `while` and `for` loops for game mechanics.
- [ ] Test Java code snippets interactively with JShell for debugging.
- [ ] Apply function overloading for flexible design patterns in scoring.

By completing this challenge, you'll deepen your understanding of Java programming constructs applied to a fun and engaging problem domain. Enjoy the process, experiment with the code, and have fun learning!