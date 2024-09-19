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
    public void testPlayerMeetsEnemyBothConditionsTrue() {
        assertTrue(game.playerMeetsEnemy(true, true));
    }

    @Test
    public void testPlayerMeetsEnemyOnlyPlayerNearby() {
        assertFalse(game.playerMeetsEnemy(true, false));
    }

    @Test
    public void testPlayerMeetsEnemyOnlyEnemyActive() {
        assertFalse(game.playerMeetsEnemy(false, true));
    }

    @Test
    public void testPlayerMeetsEnemyBothConditionsFalse() {
        assertFalse(game.playerMeetsEnemy(false, false));
    }

    @Test
    public void testUpdateScoreWithPointsOnly() {
        game.updateScore(10);
        assertEquals(10, game.getScore());
    }

    @Test
    public void testUpdateScoreWithPointsAndBonus() {
        game.updateScore(10, 5);
        assertEquals(15, game.getScore());
    }

    @Test(expected = IllegalArgumentException.