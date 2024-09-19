package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTest {

    private Player player;
    private Enemy[] enemies;
    private Game game;

    @Before
    public void setUp() {
        player = new Player();
        enemies = new Enemy[] {
            new Enemy(0, 0, true),
            new Enemy(5, 5, true),
            new Enemy(10, 10, true),
        };
        game = new Game(player, enemies);
    }

    @Test
    public void testPlayerInteractsWithEnemyAndGainsPoints() {
        player.move(0, 0);
        game.interactEnemy(enemies[0]);
        assertTrue(enemies[0].isActive());
        assertTrue(player.getScore() > 0);
    }

    @Test
    public void testInteractWithInactiveEnemyNoPoints() {
        player.move(0, 0);
        game.interactEnemy(enemies[0]);
        enemies[0].toggleActiveStatus();
        int scoreBefore = player.getScore();
        game.interactEnemy(enemies[0]);
        assertEquals(scoreBefore, player.getScore());
    }

    @Test
    public void testRunGameEndsWhenScoreReached() {
        player.collectPointsWhile(100); // Pre-fill score to 100
        game.runGame(10);
        assertTrue(player.getScore() >= 100);
    }

    @Test
    public void testSimulateEnemyMovement() {
        player.move(5, 5); // Move player to same position as one enemy
        game.simulateEnemyMovement(1);
        assertTrue(player.getScore() > 0); // Player should gain points from interaction
    }

    @Test
    public void testRunGameEndsWhenScoreNotReached() {
        game.runGame(1);
        assertTrue(player.getScore() < 100);
    }

    @Test
    public void testEnemyMovesWithinBounds() {
        enemies[0].moveRandomly();
        assertTrue(enemies[0].getPositionX() >= 0 && enemies[0].getPositionX() <= 10);
        assertTrue(enemies[0].getPositionY() >= 0 && enemies[0].getPositionY() <= 10);
    }

    @Test
    public void testPlayerDoesNotMoveOutOfBounds() {
        player.move(20, 0);
        assertTrue(player.getPositionX() <= 10);

        player.move(0, 20);
        assertTrue(player.getPositionY() <= 10);

        player.move(-20, 0);
        assertTrue(player.getPositionX() == 0);

        player.move(0, -20);
        assertTrue(player.getPositionY() == 0);
    }

    @Test
    public void testPlayerMoveWithInvalidDirection() {
        player.move("INVALID_DIRECTION"); // should not move and produce an error message
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testPlayerCollectPointsWhile() {
        player.collectPointsWhile(5);
        assertEquals(5, player.getScore());
    }
}

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

