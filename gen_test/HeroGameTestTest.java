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
    public void testInitialGameState() {
        assertEquals(0, game.toString().indexOf("playerX=0"));
        assertEquals(0, game.toString().indexOf("playerY=0"));
        assertEquals(100, game.toString().indexOf("playerHealth=100"));
        assertEquals(0, game.toString().indexOf("score=0"));
    }
    
    @Test
    public void testMovePlayerUpWithinBoundary() {
        game.movePlayer(0);
        assertEquals(0, game.toString().indexOf("playerX=0"));
        assertEquals(0, game.toString().indexOf("playerY=1"));
    }
    
    @Test
    public void testMovePlayerDownWithinBoundary() {
        game.movePlayer(0); // Move up first
        game.movePlayer(1);
        assertEquals(0, game.toString().indexOf("playerX=0"));
        assertEquals(0, game.toString().indexOf("playerY=0"));
    }
    
    @Test
    public void testMovePlayerRightWithinBoundary() {
        game.movePlayer(2);
        assertEquals(0, game.toString().indexOf("playerX=1"));
        assertEquals(0, game.toString().indexOf("playerY=0"));
    }
    
    @Test
    public void testMovePlayerLeftWithinBoundary() {
        game.movePlayer(2); // Move right first
        game.movePlayer(3);
        assertEquals(0, game.toString().indexOf("playerX=0"));
        assertEquals(0, game.toString().indexOf("playerY=0"));
    }
    
    @Test
    public void testMovePlayerUpBoundaryCondition() {
        for (int i = 0; i < 15; i++) {
            game.movePlayer(0); // Move up beyond boundary
        }
        assertEquals(0, game.toString().indexOf("playerY=10")); // Should not exceed 10
    }
    
    @Test
    public void testMovePlayerDownBoundaryCondition() {
        game.movePlayer(0); // Move up to 1
        game.movePlayer(0); // Move up to 2
        game.movePlayer(1); // Down to 1
        game.movePlayer(1); // Down to 0
        game.movePlayer(1); // Attempt to move below 0
        assertEquals(0, game.toString().indexOf("playerY=0")); // Should not be less than 0
    }
    
    @Test
    public void testMovePlayerRightBoundaryCondition() {
        for (int i = 0; i < 15; i++) {
            game.movePlayer(2); // Move right beyond boundary
        }
        assertEquals(0, game.toString().indexOf("playerX=10")); // Should not exceed 10
    }
    
    @Test
    public void testMovePlayerLeftBoundaryCondition() {
        game.movePlayer(2); // Move right to 1
        game.movePlayer(2); // Move right to 2
        game.movePlayer(3); // Left to 1
        game.movePlayer(3); // Left to 0
        game.movePlayer(3); // Attempt to move below 0
        assertEquals(0, game.toString().indexOf("playerX=0")); // Should not be less than 0
    }
    
    @Test
    public void testInvalidDirection() {
        game.movePlayer(5); // Invalid direction
        assertEquals(0, game.toString().indexOf("playerX=0"));
        assertEquals(0, game.toString().indexOf("playerY=0"));
    }
    
    @Test
    public void testCalculateScore() {
        new HeroGame().calculateScore();
        assertEquals(0, game.toString().indexOf("score=15")); // Based on journeyLog summation 1 + 2 + 3 + 4 + 5
    }
    
    @Test
    public void playerDefeatedByStrongEnemy() {
        assertFalse(game.encounterEnemy(120));
        assertEquals(0, game.toString().indexOf("playerHealth=0")); // Player defeated
    }
    
    @Test
    public void playerWinsWithSufficientHealth() {
        assertTrue(game.encounterEnemy(30));
        assertEquals(0, game.toString().indexOf("playerHealth=70"));
    }
    
    @Test
    public void successfulNegotiationWithEnemy() {
        assertTrue(game.encounterEnemy(30, 40)); // Negotiation skill greater than enemy's power
        assertEquals(0, game.toString().indexOf("playerHealth=100")); // No health deducted
    }
    
    @Test
    public void failedNegotiationLeadsToCombat() {
        assertFalse(game.encounterEnemy(30, 10));
        assertEquals(0, game.toString().indexOf("playerHealth=70")); // Health deducted since negotiation failed
    }
    
    @Test
    public void testToStringRepresentation() {
        assertEquals("HeroGame{playerX=0, playerY=0, playerHealth=100, score=0}", game.toString());
    }
}