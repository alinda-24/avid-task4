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
    public void testInitialPlayerPosition() {
        // Ensure player starts at position (0, 0).
        char[][] grid = game.getGrid();
        assertEquals('P', grid[0][0]);
    }

    @Test
    public void testValidPlayerMoves() {
        // Test moving player within grid boundaries
        game.movePlayer('S'); // Move down
        assertTrue(game.getPlayerX() == 1 && game.getPlayerY() == 0);
        
        game.movePlayer('D'); // Move right
        assertTrue(game.getPlayerX() == 1 && game.getPlayerY() == 1);
        
        game.movePlayer('W'); // Move up
        assertTrue(game.getPlayerX() == 0 && game.getPlayerY() == 1);
        
        game.movePlayer('A'); // Move left
        assertTrue(game.getPlayerX() == 0 && game.getPlayerY() == 0);
    }

    @Test
    public void testPlayerCannotMoveOutOfBounds() {
        // Try to move left or up when player is at (0, 0), should not move.
        game.movePlayer('A'); // Move left
        assertTrue(game.getPlayerX() == 0 && game.getPlayerY() == 0);
        
        game.movePlayer('W'); // Move up
        assertTrue(game.getPlayerX() == 0 && game.getPlayerY() == 0);
    }

    @Test
    public void testScorePickup() {
        // Assume the player collects a score item
        game.getGrid()[0][0] = 'S'; // Place score item at player's start position
        game.checkScore();
        assertTrue(game.getPlayerScore() == 10);
    }

    @Test
    public void testEnemyMove() {
        // Check if at least one enemy moves to a new position
        char[][] originalGrid = copyGrid(game.getGrid());
        game.moveEnemies();
        
        boolean moved = false;
        for (int i = 0; i < Game.GRID_SIZE; i++) {
            for (int j = 0; j < Game.GRID_SIZE; j++) {
                if (game.getGrid()[i][j] == 'E' && originalGrid[i][j] != 'E') {
                    moved = true;
                    break;
                }
            }
        }
        assertTrue(moved);
    }

    @Test
    public void testCollisionDetection() {
        // Test that collision with an enemy ends the game
        game.getGrid()[0][0] = 'E'; // Place enemy at start
        try {
            game.checkCollisions();
            fail("Expected System.exit to be called");
        } catch (SecurityException e) {
            // Expected path for the test
        }
    }

    @Test
    public void testResetGame() {
        game.updateScore(50);
        game.resetGame();
        assertTrue(game.getPlayerScore() == 0);
        assertEquals('P', game.getGrid()[0][0]);
    }

    @Test
    public void testResetGameWithInitialScore() {
        game.resetGame(20);
        assertTrue(game.getPlayerScore() == 20);
    }

    @Test
    public void testUpdateScoreByPoints() {
        game.updateScore(20);
        assertEquals(20, game.getPlayerScore());
    }

    @Test
    public void testUpdateScoreByMultiplier() {
        game.updateScore(10);
        game.updateScore(1.5);
        assertEquals(15, game.getPlayerScore());
    }

    private char[][] copyGrid(char[][] grid) {
        char[][] newGrid = new char[Game.GRID_SIZE][Game.GRID_SIZE];
        for (int i = 0; i < Game.GRID_SIZE; i++) {
            System.arraycopy(grid[i], 0, newGrid[i], 0, Game.GRID_SIZE);
        }
        return newGrid;
    }
}

// Note: In Java, to fully test unexpected behaviors such as `System.exit()`, you may need to use libraries or frameworks that allow for more fine-grained control over system methods for test purposes. Also, methods of the Game 