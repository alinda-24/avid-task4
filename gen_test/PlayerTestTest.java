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
    public void testInitialPlayerPositionAndScore() {
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testPlayerMovement() {
        player.move(1, 1);
        assertEquals(1, player.getPositionX());
        assertEquals(1, player.getPositionY());

        player.move("RIGHT");
        assertEquals(2, player.getPositionX());
        assertEquals(1, player.getPositionY());
    }

    @Test
    public void testPlayerCollectPointsFor() {
        player.collectPointsFor(5);
        assertTrue(player.getScore() >= 5 && player.getScore() <= 50);
    }

    @Test
    public void testPlayerMovesWithDirection() {
        player.move("UP");
        assertEquals(1, player.getPositionY());

        player.move("DOWN");
        assertEquals(0, player.getPositionY());

        player.move("LEFT");
        assertEquals(0, player.getPositionX());

        player.move("RIGHT");
        assertEquals(1, player.getPositionX());
    }
}

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

