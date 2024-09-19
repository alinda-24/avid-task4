# Simple Game Application: Player vs Enemies

Creating games is a fun and engaging way to learn programming! In this task, you will build a simple game using Java. The game will feature a player character, a scoring system, and interactions with enemies. This project will help reinforce your understanding of Java basics, including loop constructs, boolean logic, and method overloading. 

### 📝 Preparation

- Review the basic concepts of Java if-statements and loops.
- Make sure you have Java Development Kit (JDK) installed on your machine.
- Familiarize yourself with [JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm) to test small Java snippets quickly.

### ✅ Learning Goals

This task aims to teach and reinforce the following concepts:

* `boolean` expressions and operators
* `while` loops
* `for` loops
* Using JShell to try your Java program
* Function overloading

### 🚨 Troubleshooting Guide

If you encounter any issues, follow this procedure:

1. Check online communities or forums to see if others have posted about your problem.
2. Comment your issue in your version control and ask your peers for insights.
3. Experiment and iterate in JShell to isolate and understand your issue.

Discuss with your peers, but ensure your solutions are your own. Do not submit AI-generated solutions; your understanding is crucial.

### 🎮 Game Application: Player Movement and Enemy Interaction

Your game will feature a player that moves in a grid, collects points, and interacts with enemies. You will implement different functionalities, test them with JShell, and combine them to form a full game.

#### 📚 Understanding Player Movement

The player will move in a 2D grid. Use boolean expressions to check valid moves and boundaries.

1. Create a class `Player` with attributes: `x` and `y` (representing the player's position on the grid).
2. Add methods for moving the player: `moveUp()`, `moveDown()`, `moveLeft()`, `moveRight()`. Use boolean checks to prevent moving out of bounds.

```java
public class Player {
    private int x, y;
    
    public Player() {
        this.x = 0;
        this.y = 0;
    }
    
    public void moveUp() {
        if (y > 0) y--;
    }
    
    public void moveDown(int gridSize) {
        if (y < gridSize - 1) y++;
    }

    public void moveLeft() {
        if (x > 0) x--;
    }

    public void moveRight(int gridSize) {
        if (x < gridSize - 1) x++;
    }
    
    public int getX() { return x; }
    public int getY() { return y; }
}
```

#### 🔢 Implementing the Scoring System

Include scores that change as the player moves.

- Implement a method `collectItem()` that increases the score when called.
- Use function overloading: create another method `collectItem(int bonus)` that increases the score by a bonus.

#### 🕵️ Enemy Interactions

Enemies will randomly appear, interact with the player, and provide additional challenges.

- Create a class `Enemy` with positions `x` and `y`.
- Use a `for` loop to spawn enemies randomly on the grid.
- Implement a method `interact(Player)` that checks using boolean expressions if the player's position matches the enemy's position and decreases the score if they do.

#### 💡 Game Loop with `while`

Use a `while` loop to create the game loop where:

- The player is allowed to move.
- The game continues till the score reaches a target or time limit expires.

```java
public class SimpleGame {
    public static void main(String[] args) {
        Player player = new Player();
        int goalScore = 100;
        int currentScore = 0;
        int gridSize = 5;

        while (currentScore < goalScore) {
            // Example logic for player movement
            player.moveRight(gridSize);
            
            // Implement logic for score increment
            int points = player.getX() + player.getY();
            currentScore += points;
            
            // Check for interactions
            // Example: Interact with enemies (not implemented here fully)
            
            // Print current status
            System.out.println("Player Position: (" + player.getX() + ", " + player.getY() + ")");
            System.out.println("Score: " + currentScore);
        }
        
        System.out.println("You've reached your goal!");
    }
}
```

### Testing with JShell

Experiment with the `Player` movement and scoring system within JShell. Test methods incrementally to ensure proper functionality.

### 🚀 Challenge

Use the knowledge and skills you acquire to expand the game features! Consider:

- Adding additional objects in the grid to interact with.
- Implementing more complex enemy movement patterns.
- Expanding the grid size dynamically.

By the end of this assignment, you'll have a functional and entertaining basic game with a strong grasp of Java loops, boolean logic, method overloading, and testing with JShell. Happy coding! 🎉