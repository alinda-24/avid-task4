# Game Development: Hero's Quest

Video games are a fascinating way to learn programming concepts such as loops, conditions, and interactions. This week, you'll be diving into the basics of game development by crafting a simple game application called "Hero's Quest." In this game, you will implement player movement, a scoring system, and interactions with enemies. You'll integrate boolean expressions, loops, and JShell experimentation along the way. Game on! 🎮

### 👩‍🏫 Instructions

For instructions on how to do and submit the assignment, please see the [assignments section of the course instructions](https://example.com/course-instructions#assignments).

### 📝 Preparation

- Review the [lecture slides on Game Loops and Interactions](https://docs.google.com/presentation/d/12345/edit#slide=id.p)
- Read about and understand:
  - [Module: Boolean Logic and Loops](https://example.com/course/boolean-logic-loops)
  - [Java Documentation: Function Overloading and JShell](https://docs.oracle.com/javase/tutorial/)

### ✅ Learning Goals

This week's learning goals include:

* `boolean` expressions and operators
* `while` loops
* `for` loops
* Using JShell to try your Java program
* Function overloading

### 🚨 Troubleshooting Guide

If you have any questions or problems, follow this procedure: <br/>

1. Look at this week's [posted issues](https://example.com/help/issues). Are other students asking about your problem?
2. If not, post a question yourself by creating a [New Issue](https://example.com/help/issues/new). Add a descriptive title, beginning with "Hero's Quest: summary of problem here."
3. Ask a TA in person during the [weekly lab](https://example.com/queue). Check your schedule to see when the next lab is.

We encourage you to discuss with your course friends, **but do not share answers!** Similarly, use of any AI services 🤖 is great for explanations, **but please do not submit AI-generated solutions** - you must be both responsible for your own solutions and must be able to explain them under examination.

### 🏛 Assignment

In order to create your game, you must understand how the player interacts with the game world using `boolean` expressions, and how iterations (`while` and `for` loops) can manage game flow.

<details>
<summary> 📚 Boolean values, expressions, and operators </summary>
<! -- requires a blank space -->

A [boolean value](https://en.wikipedia.org/wiki/Boolean_data_type) is a value that is either true or false. In Java, `boolean` is one of the 8 [primitive types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html), and can have the value `true` or `false`.

Booleans help evaluate game conditions—like whether a player has collided with an enemy. Java uses `&&` for "and", `||` for "or" and `!` for "not".

</details>

#### Exercise 1 -- Setting Up

Create a new Java class named `HeroGame.java` in your `src` folder.

#### Exercise 2 -- Implementing Player Movement

1. **Set Up Fields:** Create fields for player position (`x`, `y`) and health, ensuring they suit your game's requirements. Make sure they are private.
2. **Movement Method:** Write a method using a `while` loop to handle continuous player movement. It should have the signature:
   ```java
   public void movePlayer(int direction)
   ```
   Use `boolean` expressions to determine movement within bounds (e.g., if the player tries to move outside game boundaries, stop them).

#### Exercise 3 -- Scoring System with Loops

Add a method to calculate and display the player's score using a `for` loop. Players score points for every step taken without interaction with an enemy. Use the header:
```java
public void calculateScore()
```
The method should iterate over a journey log array, counting steps and updating the score.

#### Exercise 4 -- Enemy Interactions

Write a method to simulate encounters with enemies:
```java
public boolean encounterEnemy(int enemyPower)
```
Use `boolean` logic to decide outcomes based on the player's health and the enemy's power. Test outcomes using JShell to see how `boolean` expressions evaluate during encounters:

```bash
jshell HeroGame.java
HeroGame game = new HeroGame();
game.encounterEnemy(10);
```

#### Exercise 5 -- Overloaded Interaction

Use function overloading for different interactions:
- One method for a simple encounter
- Another that involves negotiation, e.g., `encounterEnemy(int power, int negotiationSkill)`.

#### Exercise 6 -- Final Touches

Combine modern Java features to enhance your game:
- Use `toString` to print game state
- Loop over game states to allow for repeated play
- Test functions in JShell for immediate results.

### ❎ Checklist

- [ ] Create the `HeroGame.java` class and define fields.
- [ ] Implement `movePlayer(int direction)` using a `while` loop.
- [ ] Implement `calculateScore()` using a `for` loop.
- [ ] Implement `encounterEnemy(int enemyPower)` and test using JShell.
- [ ] Use function overloading for enemy interactions.
- [ ] Experiment with JShell throughout your tasks for debugging and checking your logic.

By the end of the assignment, you should be able to dynamically approach game scenarios using iterations, apply boolean logic to ensure desired game outcomes, utilize function overloading effectively, and test your code using JShell for rapid development and testing. Enjoy creating your very own mini-game! 🌟