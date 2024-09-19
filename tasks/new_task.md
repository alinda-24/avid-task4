# Simple Game Application Development

Games have always been a great way to engage users and challenge them to explore different functionalities. In this assignment, you will be creating a simple game application where a player can navigate through a field, interact with enemies, and accumulate scores. This project will involve implementing player movement, a scoring system, and interactions with enemies. Throughout this assignment, we'll make use of iteration and logic concepts such as `boolean` expressions, `while` and `for` loops, and function overloading in Java. You'll also explore the use of JShell to test your Java code efficiently.

### 📝 Preparation

- Review the [API documentation](https://docs.oracle.com/en/java/javase/17/docs/api/index.html).
- Study Java's handling of boolean expressions and logical operators: [`Logical Operators in Java`](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html).
- Be familiar with Java loops: [`The while and for Statement`](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html).
- Introduction to class and method overloading in Java: [`Overloading Methods`](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html).
- Learn about JShell: [`JShell: The Java Shell`](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm).

### ✅ Learning Goals

This week's learning objectives are to:

* Understand `boolean` expressions and operators to control game logic.
* Utilize `while` loops for continuous game actions.
* Implement `for` loops for repetitive operations, such as updating scores and enemy movements.
* Use JShell to test Java code snippets and subroutines.
* Explore function overloading to enhance flexibility in class design.

### 🚨 Troubleshooting Guide

1. Check this week’s [discussion board](https://student.forums/) for similar issues.
2. Post your own question with a descriptive title if your issue hasn’t been addressed.
3. Attend the [help sessions](https://support.meetings/) during the week for direct assistance.

Discuss your ideas with classmates, but remember **do not share solutions!** Use AI tools to conceptualize problems but ensure your solutions are entirely your own so you can confidently explain during evaluations.

### 🎮 Assignment

#### Exercise 1: Setup and Movement

1. **Create the Player Class**

   - Include fields for `positionX`, `positionY`, and `score` with appropriate data types.
   - Add a constructor to initialize the player at a starting position, e.g., (0,0) and a score of 0.

2. **Method for Player Movement**

   - Add overloaded methods `move(int dx, int dy)` and `move(String direction)` to update player position.
     - Use `boolean` expressions to ensure the player doesn't move out of bounds.
     - Implement the `String direction` version to handle movements like "UP", "DOWN", "LEFT", "RIGHT".
     - Use a `switch` or `if` statements with `boolean` conditions to decide movements.
  
3. **JShell Testing**

   - Use JShell to interactively verify the player’s movement methods:
   ```bash
   jshell Player.java
   /open Player
   Player p = new Player();
   ```

#### Exercise 2: Scoring with Loops

1. **Scoring System**

   - Implement a `while` loop to simulate collecting points over time.
   - Create a method `void collectPointsWhile(int targets)` that simulates collecting points by incrementally increasing the score while there are points remaining.
   - Test this method using JShell.

2. **Advanced Scoring with `for` Loops**

   - Implement `void collectPointsFor(int rounds)`, where each round the player gains a random number of points from 1-10.
   - Use a `for` loop to repeat for the given number of rounds.
   - Test the method using JShell.

#### Exercise 3: Enemy Interaction

1. **Create the Enemy Class**

   - Add fields `positionX`, `positionY`, `activeStatus` (boolean).
   - Use function overloading by having multiple constructors to initialize enemies at various difficulty settings.

2. **Player and Enemy Interaction**

   - Implement a method `interactEnemy(Enemy enemy)` in the Player class.
     - Use a `boolean` expression to decide what happens when the player encounters an enemy.
     - If the player and enemy are on the same position, toggle the enemy's active status and update the player's score.

3. **Enemy Movement and Interaction Loop**

   - Develop a method `simulateEnemyMovement(Enemy[] enemies, int turns)`, which uses a loop to move enemies randomly each turn.
   - After each move, check for interactions with the player.

#### Exercise 4: Game Loop and Dynamics

1. **Continuous Game Simulation**

   - Build a method `runGame(int turns)` in a `Game` class that simulates a game session for a defined number of turns.
   - Use a `while` loop to provide continuous game turns until a condition, such as player reaching a score threshold or all enemies defeated.

2. **Integrative Testing in JShell**

   - Use JShell to test the full interaction between Player and Enemy classes:
   ```bash
   jshell Game.java
   Game game = new Game();
   game.runGame(10);
   ```

This assignment aims to deepen your understanding of loops, boolean logic, and method overloading in Java while harnessing the power of JShell for interactive coding and testing. Good luck, and have fun developing your simple game!