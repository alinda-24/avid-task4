package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy(0, 0, true);
    }

    @Test
    public void testInitialEnemyProperties() {
        assertEquals(0, enemy.getPositionX());
        assertEquals(0, enemy.getPositionY());
        assertTrue(enemy.isActive());
    }

    @Test
    public void testEnemyToggleActiveStatus() {
        enemy.toggleActiveStatus();
        assertTrue(!enemy.isActive());

        enemy.toggleActiveStatus();
        assertTrue(enemy.isActive());
    }

    @Test
    public void testEnemyMoveRandomly() {
        enemy.moveRandomly();
        assertTrue(enemy.getPositionX() >= 0 && enemy.getPositionX() <= 10);
        assertTrue(enemy.getPositionY() >= 0 && enemy.getPositionY() <= 10);
    }
}