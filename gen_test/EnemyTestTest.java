package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class EnemyTest {

    private Enemy enemy;
    private Player player;

    @Before
    public void setUp() {
        // Assume the enemy is at position (0,0) initially
        enemy = new Enemy(0, 0);
        player = new Player();
    }

    @Test
    public void testEnemyInteractionWhenPlayerAtSamePositionDecreasesPlayerScore() {
        // Assume player's initial score is zero
        enemy.interact(player);
        assertEquals(-15, player.getScore());
    }

    @Test
    public void testEnemyInteractionWhenPlayerNotAtSamePositionDoesNotChangePlayerScore() {
        player.moveRight(5); // Move player to (1,0)
        enemy.interact(player);
        assertEquals(0, player.getScore());
    }

    @Test
    public void testEnemyPositionInitialization() {
        enemy = new Enemy(2, 3);
        assertEquals(2, enemy.getX());
        assertEquals(3, enemy.getY());
    }
}