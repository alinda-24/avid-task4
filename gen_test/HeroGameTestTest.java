package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class HeroGameTest {

    private HeroGame game;

    @Before
    public void setUp() {
        game = new HeroGame();
    }

    @Test
    public void defaultConstructorInitializesHeroCorrectly() {
        assertEquals("HeroGame{playerX=0, playerY=0, playerHealth=100, score=0}", game.toString());
    }

    @Test
    public void movePlayerUpIncrementsY() {
        game.movePlayer(0);
        assertEquals("HeroGame{playerX=0, playerY=1, playerHealth=100, score=0}", game.toString());
    }

    @Test
    public void encounterEnemyWithHigherPowerResultsInDefeat() {
        assertFalse(game.encounterEnemy(150));
        assertEquals(0, game.playerHealth);
    }

    @Test
    public void encounterEnemyWithNegotiationSucceeds() {
        assertTrue(game.encounterEnemy(50, 60));
    }

    @Test
    public void encounterEnemyWithNegotiationFails() {
        assertFalse(game.encounterEnemy(50, 40));
        assertEquals(50, game.playerHealth);
    }
}

// LoopingTaskTest.java

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

