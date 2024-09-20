package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTest {

    private Player player;
    private Enemy enemy;
    private Game game;

    @Before
    public void setUp() {
        player = new Player();
        enemy = new Enemy(2, 2);
        game = new Game();
    }
    
    @Test
    public void playerInitialization() {
        assertEquals(0, player.x);
        assertEquals(0, player.y);
        assertEquals(0, player.score);
        assertEquals(0, player.moves);
    }
    
    @Test
    public void enemyInitialization() {
        assertEquals(2, enemy.x);
        assertEquals(2, enemy.y);
    }
    
    @Test
    public void playerMovement() {
        player.x = 0;
        player.y = 0;
        
        game.interactWithGame("W");
        assertEquals(0, player.y);
        
        game.interactWithGame("A");
        assertEquals(0, player.x);
        
        game.interactWithGame("S");
        assertEquals(1, player.y);
        
        game.interactWithGame("D");
        assertEquals(1, player.x);
    }
    
    @Test
    public void testCalculateScore() {
        player.x = 2;
        player.y = 2;
        player.moves = 1;

        int score = game.calculateScore();

        assertEquals(player.score + 10, score);
    }
    
    @Test
    public void playerScoreOnCentralPosition() {
        player.x = 2;
        player.y = 2;
        player.moves = 5;
        
        assertEquals(50, game.calculateScore());
    }
    
    @Test
    public void invalidMovement() {
        player.x = 0;
        player.y = 0;
        
        game.interactWithGame("Z");
        assertEquals(0, player.x);
        assertEquals(0, player.y);
    }
    
    @Test
    public void testQuitGame() {
        setInput("Q\n");
        assertFalse(game.updateGameState());
    }
    
    @Test
    public void testIsEnemyPosition() {
        assertTrue(game.isEnemyPosition(2, 2));
        assertFalse(game.isEnemyPosition(0, 0));
    }
    
    @Test
    public void testEnemyMovementAndCollision() {
        player.x = 2;
        player.y = 2;
        
        game.enemyMovement();
        
        // Check for player reset
        assertEquals(0, player.x);
        assertEquals(0, player.y);
    }
    
    @Test
    public void testInteractString() {
        game.interact("Goblin");
        assertEquals("Encountered enemy of type: Goblin\n", getOutput());
    }
    
    @Test
    public void testInteractBonus() {
        player.score = 0;
        
        game.interact(100);
        
        assertEquals(100, player.score);
    }
    
    // Utility methods
    private void setInput(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    private String getOutput() {
        // Implement logic to capture output if required
        return "";  // Placeholder
    }
    
    @Test
    public void testBoundaryConditions() {
        player.x = 0;
        player.y = 0;
        
        game.interactWithGame("A");
        assertEquals(0, player.x);
        
        game.interactWithGame("W");
        assertEquals(0, player.y);
        
        player.x = 4;
        player.y = 4;
        
        game.interactWithGame("D");
        assertEquals(4, player.x);
        
        game.interactWithGame("S");
        assertEquals(4, player.y);
    }
}

