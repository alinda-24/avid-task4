# Simple Game Application in Java

Creating a game can be an excellent way to solidify your understanding of various programming concepts. In this task, you'll create a simple console-based game featuring player movement, a scoring system, and enemy interactions. As you develop this game, you'll leverage essential Java concepts such as boolean expressions, loops, function overloading, and more. Let's dive in and create a game framework that can bring your ideas to life!

### 📝 Preparation

Before starting the assignment, please ensure you've reviewed the following resources and answered any related questions:

- Review the [lecture slides on Java Basics and Game Development](https://example-link.com)
- Complete the exercises on:
  - [Module 5: Boolean Logic in Games](https://example-link.com)
  - [Module 6: Looping and Iteration](https://example-link.com)

### ✅ Learning Goals

This task will help you achieve the following objectives:

* Mastery of `boolean` expressions and operators
* Proficiency in using `while` loops
* Understanding of `for` loops
* Practical experience using JShell for Java testing
* Application of function overloading in a game context

### 🚨 Troubleshooting Guide

In case of any issues, follow these steps:

1. Consult this week's [issue tracker](https://example-link.com/issues) to see if others have similar problems.
2. If not, post a new question by creating a [New Issue](https://example-link.com/issues/new) with a descriptive title starting with "Task _x_: _problem summary_".
3. Reach out to a TA during [weekly labs](https://example-lab-schedule.com). Check your timetable for lab sessions.

Remember, collaboration is encouraged—discuss problems with peers—but avoid sharing solutions directly. Use AI tools to help comprehend concepts but not to generate final answers, ensuring complete comprehension and readiness for examination.

### 🏛️ Assignment

In this game, you will program player movement, scoring mechanics, and enemy interactions. Understanding how to implement these features will involve using loops and conditionals effectively.

### Game Skeleton and Functionality

#### Setting Up
- Create a Java class named `Game.java` in your `src` folder.

#### Exercise 1: Player Movement and Boolean Logic

<details>
<summary> 📚 Player Movement and Boolean Logic </summary>

A player will move within a grid (e.g., 5x5), starting at position (0,0). You'll write logic that allows player movement using boolean conditions: moving up, down, left, or right as long as they stay within the grid boundaries.

```java
// boolean expression example
boolean canMoveUp = playerY > 0;

if (canMoveUp) {
    playerY -= 1; // move one step up
}
```
Explore more about [logical operators](https://www.tutorialspoint.com/java/java_basic_operators.htm).

</details>

#### Exercise 2: Implementing the `while` Loop for Game Continuity

```java
// Implementing a game loop using a while-loop
public void startGame() {
    boolean isGameRunning = true;

    while (isGameRunning) {
        // Game logic here
        displayBoard();
        
        // Capture player movement
        // isGameRunning = updateGameState();
    }
}
```

### Exercise 3: Scoring with For Loops

Write a method to calculate the player's score based on their position and the number of moves they've made. Use a `for` loop for tasks like tallying points every time the player reaches specific locations (e.g., central grid position).

```java
public int calculateScore() {
    int score = 0;

    // Simple scoring mechanism
    for (int i = 0; i < moves; i++) {
        if (playerX == center && playerY == center) {
            score += 10;
        }
    }
    return score;
}
```

#### Exercise 4: Using JShell

> **Assistant’s Tip:** Test snippets quickly with [JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm). For example, to check:
```bash
jshell> int x = 10; int y = 15; boolean result = x != y;
```

#### Exercise 5: Function Overloading for Interaction

Create multiple overloaded methods named `interact` to allow different types of interactions with game elements, such as enemies or bonuses.

```java
public void interact(String enemyType) {
    // Handle enemy interaction
}

public void interact(int bonus) {
    // Handle bonus interaction
}
```

### Exercise 6: Develop Enemy Movement and Interactions

Lastly, implement enemy behavior using loops and boolean conditions to check for collisions with the player. Create an `Enemy` class for more complex logic.

```java
public void enemyMovement() {
    for (Enemy enemy : enemyList) {
        // Move and check for collisions
        if (playerX == enemy.x && playerY == enemy.y) {
            // Interaction logic
        }
    }
}
```

### Closing Thoughts

With the foundational elements established in the exercises above, your game will have a dynamic system for player movement, scoring, and interactions. Remember to test code snippets often, iteratively build upon your design, and utilize function overloading to enhance gameplay capabilities.

Good luck, and may your code be ever bug-free! 🕹️🎮