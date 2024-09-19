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
    public void initialScoreIsZero() {
        assertEquals(0, game.getScore());
    }

    @Test
    public void initialPlayerPositionIsValid() {
        assertTrue(game.getPlayerX() >= 0);
        assertTrue(game.getPlayerY() >= 0);
    }

    @Test
    public void initialEnemyPositionIsValid() {
        assertTrue(game.getEnemyX() >= 0);
        assertTrue(game.getEnemyY() >= 0);
    }

    @Test
    public void initialGameIsNotOver() {
        assertFalse(game.isGameOver());
    }

    @Test
    public void movePlayerValidPositionChangesPosition() {
        int initialX = game.getPlayerX();
        int initialY = game.getPlayerY();
        game.movePlayer(1, 1);
        assertEquals(initialX + 1, game.getPlayerX());
        assertEquals(initialY + 1, game.getPlayerY());
    }

    @Test(expected = IllegalArgumentException.