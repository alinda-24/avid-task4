# 🚀 Game Development with Java

A very exciting aspect of programming is creating interactive experiences like games! This task will guide you through creating a simple 2D game using Java where you can control a player character, score points, and interact with enemies. We will explore core Java functionalities like boolean expressions, loops, function overloading, and using JShell. By the end, you'll have a complete game loop that ties these concepts together.

### 📝 Preparation

- Review the [Java Basics](https://www.w3schools.com/java/) if needed.
- Familiarize yourself with JShell by reading the [JShell Guide](https://www.oracle.com/technical-resources/articles/java/jshell.html).
- Skim over the [Java for Beginners Guide](https://www.tutorialspoint.com/java/) to refresh your basic Java knowledge.

### ✅ Learning Goals

This week's learning goals include:

- `boolean` expressions and operators
- `while` loops
- `for` loops
- Using JShell to try your Java program
- Function overloading

### 🚨 Troubleshooting Guide

If you have questions or encounter issues, follow this procedure:

1. Check the [student forum](https://www.exampleforum.com) for similar problems.
2. Start a [New Discussion](https://www.exampleforum.com/new-discussion) with a descriptive title if your query isn't addressed.
3. Approach your instructor or peers during office hours or study groups.

**Discussing with classmates is encouraged, but do not exchange complete code!** Remember, specified learning objectives aim to bolster your understanding and capabilities in programming independently and within examinations.

### 🎮 Game Development Assignment

It's time to create a simple interactive Java game. You're encouraged to use JShell to test segments of your code for quicker feedback!

#### 🌟 Part 1: Setting Up the Game Environment

1. **Create the Game Main Loop:**  
   - Start by creating a new Java file `Game.java`.
   - Define the main method that will serve as the game's loop.

```java
public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    public void start() {
        boolean gameRunning = true;
        while (gameRunning) {
            // Game logic
            gameRunning = false; // Temporary to exit the loop
        }
        System.out.println("Game Over");
    }
}
```

2. **Testing with JShell:**  
   - Use JShell to ensure the loop works by executing snippets of the above code.

```bash
jshell Game.java
/run Game.main()
```

#### 👨‍🔧 Part 2: Player Movement

1. **Implement Player Movement:**  
   - Add a method to handle player input using arrows to move the player.

```java
public class Game {
    private int playerPositionX = 0;
    private int playerPositionY = 0;

    private void updatePlayer() {
        // Simulate getting keyboard input with dummy data
        boolean up = false, down = true, left = false, right = false;
        if (up) playerPositionY -= 1;
        if (down) playerPositionY += 1;
        if (left) playerPositionX -= 1;
        if (right) playerPositionX += 1;
    }
}
```

2. **Use Boolean Expressions:**  
   - Modify the `updatePlayer` logic with boolean expressions to determine directional movement.

3. **Testing:**  
   - Use JShell to step through player movement logic.

#### 🕹️ Part 3: Scoring System

1. **Implement Scoring System:**  
   - Add a scoring mechanism that increases points when certain conditions are met.

```java
private int score = 0;

private void updateScore() {
    boolean playerScored = playerPositionX == 5 && playerPositionY == 5;
    if (playerScored) {
        score += 10;
    }
}
```

2. **Loop Over Attempts:**  
   - Use a `for` loop to simulate player turns of moving and scoring.

3. **Test with JShell:**  
   - Ensure the score logic behaves correctly through simulation.

#### 🕶️ Part 4: Enemy Interactions

1. **Create Enemy Logic:**
   - Define enemies and introduce collision logic where the game ends if the player and enemy overlap.

```java
private int enemyPositionX = 5;
private int enemyPositionY = 5;

private void checkEnemyCollision() {
    boolean hasCollision = playerPositionX == enemyPositionX &&
                           playerPositionY == enemyPositionY;
    if (hasCollision) {
        System.out.println("Collision Detected!");
        gameRunning = false; // End the game
    }
}
```

2. **Implement Enemy Movement (Method Overloading):**  
   - Create variations of enemy movement using function overloading.

```java
private void moveEnemy(int deltaX, int deltaY) {
    enemyPositionX += deltaX;
    enemyPositionY += deltaY;
}

private void moveEnemy() {
    // Default random movement
    enemyPositionX += 1;
    enemyPositionY += 1;
}
```

3. **Verify with JShell:**  
   - Test enemy movement and collision to ensure logic has been correctly implemented.

#### 🔄 Part 5: Integrating and Testing Game Flow

- Constantly utilize JShell to test pieces of your game logic effectively.
- Ensure the loop processes through one complete cycle of updating players, scoring, enemy movement, and collision checking.

#### 🚀 Final Step: Enhance and Extend

- Consider adding more complex enemy patterns.
- Introduce game difficulty or more extensive scoring rules.
- Experiment with more advanced Java constructs to refine your game further.

By executing each part, you leverage core programming concepts and gain hands-on experience creating games in an educational setting. Enjoy the process, and iterate creatively!