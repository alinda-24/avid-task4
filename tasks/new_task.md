# Game Development in Java

Creating a game can be an engaging way to learn programming concepts, particularly when it involves player movement, a scoring system, and interactions with enemies. In this task, you will build a simple text-based game in Java that incorporates player movement, scoring, and enemy interactions. This task will help demonstrate the concepts of boolean expressions, `while` loops, `for` loops, and function overloading, alongside the usage of JShell for real-time testing.

### 📝 Preparation

- Review the following resources to better understand the required concepts:
  - [Boolean Expressions and Operators in Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)
  - [Loops in Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html)
  - [Function Overloading in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
- Play with simple Java expressions in [JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm) to understand how quick testing enhances coding workflow.

### ✅ Learning Goals

This task will focus on:

- `boolean` expressions and operators
- `while` loops
- `for` loops
- Using JShell to experiment with Java programs
- Function overloading

### 🚨 Troubleshooting Guide

For issues or questions:

1. Browse [recent issues](https://gits-15.sys.kth.se/inda-24/help/issues). Check if others have faced similar challenges.
2. If unanswered, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new). Title it with "Task _x_: _summary of problem here_".
3. Reach out to a TA during scheduled [labs](https://queue.csc.kth.se/Queue/INDA).

Discuss ideas with peers, **but don't share solutions!** If using AI to understand concepts, verify it by doing the task on your own.

### 🏛 Assignment

You will implement a simple game where the player can move around, score points, and encounter enemies. Follow these steps to develop the game:

#### Exercise 1: Understanding and Using Boolean Expressions

1. In the project root, create a file named `Game.java`.
2. Start by implementing basic boolean expressions:
   - Inside `Game.java`, add a method:
     ```java
     public boolean playerMeetsEnemy(boolean isPlayerNearby, boolean isEnemyActive) {
         return isPlayerNearby && isEnemyActive;
     }
     ```
3. Use JShell to test simple expressions. Try `playerMeetsEnemy(true, true)` and observe the output.

#### Exercise 2: Implementing Game Loop with `while` 

1. Incorporate a game loop using a `while` statement that keeps the game running until the player decides to quit:
   ```java
   public void startGame() {
       boolean isGameRunning = true;
       int playerScore = 0;

       while (isGameRunning) {
           // Logic for player actions and scoring
           System.out.println("Do you want to continue? (yes/no)");
           // Use a Scanner object to read input
           // Update isGameRunning based on player input
           // Increment score for certain actions
       }
   }
   ```
2. Utilize boolean expressions within the loop to handle player interactions and stop conditions.

#### Exercise 3: Using `for` Loops for Enemy Movement

1. Design a simple enemy movement pattern using a `for` loop:
   ```java
   public void enemyPatrol(int steps) {
       for (int i = 0; i < steps; i++) {
           // Simulate enemy moving one step
           System.out.println("Enemy moves to step " + i);
       }
   }
   ```
2. Integrate this within `startGame()` to simulate enemies moving each game cycle.

#### Exercise 4: Function Overloading for Adding Scores

1. Create overloaded methods for updating the player's score. These methods can vary by the number of points added to the score.
   ```java
   public void updateScore(int points) {
       // Update the player's score with the points
   }

   public void updateScore(int points, int bonus) {
       // Update the player's score with points and a bonus
   }
   ```
2. Use these methods in the game loop to update the score based on different challenges or collected bonuses.

#### Exercise 5: Testing with JShell

1. Utilize JShell for testing smaller segments of your code before integrating them into the main program.
2. Test boolean logic, individual methods, and loops in JShell to ensure functionality.

By the end of this task, you should have a basic interactive game where a player navigates a space, collects points, and interacts with enemies. The primary aim is to reinforce your understanding of using boolean expressions, loops, and function overloading in practical applications, all while also engaging in game development.

---
This task involves several coding exercises to deepen your grasp of fundamental programming concepts, using a fun and interactive game setting as a learning platform.