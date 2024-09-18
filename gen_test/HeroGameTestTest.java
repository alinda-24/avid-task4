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
    public void initialState_isCorrect() {
        assertEquals(0, game.getPlayerX());
        assertEquals(0, game.getPlayerY());
        assertEquals(100, game.getPlayerHealth());
        assertEquals(0, game.getScore());
    }

    @Test
    public void movePlayer_upMovement() {
        game.movePlayer(0);
        assertEquals(1, game.getPlayerY());
    }

    @Test
    public void movePlayer_downMovement() {
        game.movePlayer(2); // Right to 1,0 to ensure downward movement
        game.movePlayer(1); // Move down to 1,0
        assertEquals(0, game.getPlayerY());
    }

    @Test
    public void movePlayer_rightMovement() {
        game.movePlayer(2);
        assertEquals(1, game.getPlayerX());
    }

    @Test
    public void movePlayer_leftMovement() {
        game.movePlayer(2); // Move right to 1,0 to ensure left movement
        game.movePlayer(3);
        assertEquals(0, game.getPlayerX());
    }

    @Test
    public void calculateScore_updatesCorrectly() {
        game.calculateScore();
        assertEquals(15, game.getScore()); // 1+2+3+4+5 = 15
    }

    @Test
    public void encounterEnemy_survivesCombat() {
        assertTrue(game.encounterEnemy(30));
        assertEquals(70, game.getPlayerHealth());
    }

    @Test
    public void encounterEnemy_defeatedInCombat() {
        assertFalse(game.encounterEnemy(120));
        assertEquals(0, game.getPlayerHealth());
    }

    @Test
    public void encounterEnemy_successfulNegotiation() {
        assertTrue(game.encounterEnemy(20, 25));
    }

    @Test
    public void encounterEnemy_failedNegotiation() {
        assertFalse(game.encounterEnemy(30, 15)); // Not enough negotiation skill
        assertEquals(70, game.getPlayerHealth()); // Takes as combat
    }
}