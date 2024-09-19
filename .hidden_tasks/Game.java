import java.util.Random;

public class Game {
    private Player player;
    private Enemy[] enemies;
    
    public Game(Player player, Enemy[] enemies) {
        this.player = player;
        this.enemies = enemies;
    }

    public void interactEnemy(Enemy enemy) {
        if (player.getPositionX() == enemy.getPositionX() && 
            player.getPositionY() == enemy.getPositionY()) {
            if (enemy.isActive()) {
                player.collectPointsFor(1); // Gain points if enemy active
                enemy.toggleActiveStatus(); // Toggle enemy active status
            }
        }
    }

    // Simulate enemy movements and check interactions
    public void simulateEnemyMovement(int turns) {
        for (int i = 0; i < turns; i++) {
            for (Enemy enemy : enemies) {
                enemy.moveRandomly();
                interactEnemy(enemy);
            }
        }
    }

    // Run a continuous game loop
    public void runGame(int turns) {
        int currentTurn = 0;
        
        while (currentTurn < turns) {
            simulateEnemyMovement(1);
            if (player.getScore() >= 100) {
                System.out.println("Player reached the score goal!");
                break;
            }
            currentTurn++;
        }
    }
}