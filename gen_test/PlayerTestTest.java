package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player();
    }

    @Test
    public void constructorInitializesPlayerAtZeroPositionWithZeroScore() {
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
        assertEquals(0, player.getScore());
    }

    @Test
    public void moveUpDecrementsYWhenYGreaterThanZero() {
        player.moveDown(5);
        player.moveUp();
        assertEquals(0, player.getY());
    }

    @Test
    public void moveUpDoesNotDecrementYBelowZero() {
        player.moveUp();
        assertEquals(0, player.getY());
    }

    @Test
    public void moveDownIncrementsYWhenBelowGridSize() {
        player.moveDown(5);
        assertEquals(1, player.getY());
    }

    @Test
    public void moveDownDoesNotIncrementYWhenAtGridEdge() {
        for (int i = 0; i < 5; i++) {
            player.moveDown(5);
        }
        player.moveDown(5);
        assertEquals(4, player.getY());
    }

    @Test
    public void moveLeftDecrementsXWhenXGreaterThanZero() {
        player.moveRight(5);
        player.moveLeft();
        assertEquals(0, player.getX());
    }

    @Test
    public void moveLeftDoesNotDecrementXBelowZero() {
        player.moveLeft();
        assertEquals(0, player.getX());
    }

    @Test
    public void moveRightIncrementsXWhenBelowGridSize() {
        player.moveRight(5);
        assertEquals(1, player.getX());
    }

    @Test
    public void moveRightDoesNotIncrementXWhenAtGridEdge() {
        for (int i = 0; i < 5; i++) {
            player.moveRight(5);
        }
        player.moveRight(5);
        assertEquals(4, player.getX());
    }

    @Test
    public void collectItemIncrementsScoreByDefaultAmount() {
        player.collectItem();
        assertEquals(10, player.getScore());
    }

    @Test
    public void collectItemWithBonusIncrementsScoreCorrectly() {
        player.collectItem(15);
        assertEquals(15, player.getScore());
    }

    @Test
    public void collectItemWithNegativeBonusDecreasesScore() {
        player.collectItem(-5);
        assertEquals(-5, player.getScore());
    }
}

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

