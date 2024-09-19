import java.util.Scanner;
import java.util.Random;

public class SimpleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        int goalScore = 100;
        int gridSize = 5;
        Random rand = new Random();
        
        // Spawning enemies randomly
        int enemyCount = 3;
        Enemy[] enemies = new Enemy[enemyCount];
        for (int i = 0; i < enemyCount; i++) {
            int ex = rand.nextInt(gridSize);
            int ey = rand.nextInt(gridSize);
            enemies[i] = new Enemy(ex, ey);
        }
        
        while (player.getScore() < goalScore) {
            System.out.println("Player Position: (" + player.getX() + ", " + player.getY() + ")");
            System.out.println("Score: " + player.getScore());
            System.out.println("Move: (w)up (s)down (a)left (d)right");
            char move = scanner.nextLine().charAt(0);
            
            switch (move) {
                case 'w': player.moveUp(); break;
                case 's': player.moveDown(gridSize); break;
                case 'a': player.moveLeft(); break;
                case 'd': player.moveRight(gridSize); break;
                default: System.out.println("Invalid move"); continue;
            }
            
            // Check interaction with enemies
            for (Enemy enemy : enemies) {
                enemy.interact(player);
            }
            
            // Update score (example logic for collecting items)
            player.collectItem(5); // Score for each move (basic rule)
        }
        
        System.out.println("You've reached your goal!");
        scanner.close();
    }
}