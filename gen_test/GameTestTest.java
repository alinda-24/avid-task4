package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testInitialPositions() {
        String gameState = getGameState();
        assertTrue(gameState.contains("Player Position: (0, 0)"));
        assertTrue(gameState.contains("Enemy Position: (5, 5)"));
        assertTrue(gameState.contains("Score: 0"));
    }

    @Test
    public void testPlayerMovementDown() {
        game.start();
        String gameState = getGameState();
        assertTrue(gameState.contains("Player Position: (0, 1)"));
    }

    @Test
    public void testScoreUpdateWhenPlayerScores() {
        game.start();
        game.movePlayerToPosition(5, 5);
        game.checkScoreAndUpdate();
        String gameState = getGameState();
        assertTrue(gameState.contains("Score: 10"));
    }

    @Test
    public void testEnemyCollisionEndsGame() {
        game.movePlayerToPosition(5, 5);
        game.moveEnemyToPosition(5, 5);
        game.checkForCollision();
        assertFalse(game.isGameRunning());
    }

    @Test
    public void testMultipleScoreUpdates() {
        game.start();
        game.movePlayerToPosition(5, 5);
        game.checkScoreAndUpdate();
        game.movePlayerToPosition(5, 5);
        game.checkScoreAndUpdate();
        String gameState = getGameState();
        assertTrue(gameState.contains("Score: 20"));
    }

    @Test
    public void testEnemyMovementUpdatesCorrectly() {
        game.start();
        game.moveEnemy(2, 2);
        String gameState = getGameState();
        assertTrue(gameState.contains("Enemy Position: (7, 7)"));
    }

    @Test
    public void testPerformanceWithMultipleIterations() {
        for (int i = 0; i < 1000; i++) {
            game.start();
            game.movePlayerToPosition(i, i);
            game.moveEnemyToPosition(i, i);
        }
        assertTrue(game.isGameRunning());
    }

    @Test
    public void testInvalidMovementBeyondBoundaryDoesNothing() {
        game.movePlayerToPosition(-1, 0);
        String gameState = getGameState();
        assertTrue(gameState.contains("Player Position: (0, 0)"));
    }

    private String getGameState() {
        // Capture the output while invoking printGameState
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        game.printGameState();
        return out.toString();
    }
}