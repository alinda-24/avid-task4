import java.util.ArrayList;
import java.util.List;

public class HeroGame {

    private int playerX;
    private int playerY;
    private int playerHealth;
    private int score;
    private List<Integer> journeyLog;
    private static final int BOUNDARY_X = 100;
    private static final int BOUNDARY_Y = 100;

    public HeroGame() {
        playerX = 50; // Initial player position (example value)
        playerY = 50; // Initial player position (example value)
        playerHealth = 100; // Initial health
        journeyLog = new ArrayList<>();
    }

    // Method to move player in different directions
    public void movePlayer(int direction) {
        while (true) {
            switch (direction) {
                case 0: // Move up
                    playerY++;
                    break;
                case 1: // Move down
                    playerY--;
                    break;
                case 2: // Move left
                    playerX--;
                    break;
                case 3: // Move right
                    playerX++;
                    break;
                default:
                    // Invalid direction
                    break;
            }
            journeyLog.add(direction);
            
            // Example of manual exit from the loop (for demonstration purposes only)
            if (playerX == BOUNDARY_X || playerY == BOUNDARY_Y || playerX == 0 || playerY == 0) break;
        }
    }

    // Method to calculate score
    public void calculateScore() {
        int steps = 0;
        for (int step : journeyLog) {
            steps++;
        }
        score = steps; // Simple scoring by steps
        System.out.println("Score: " + score);
    }

    // Method to handle encounters with enemies
    public boolean encounterEnemy(int enemyPower) {
        if (enemyPower > playerHealth) {
            // TODO: Implement logic and return the appropriate value.
            return false;
        } else {
            // TODO: Implement logic and return the appropriate value.
            return true;
        }
    }

    // Overloaded method to handle negotiation with enemies
    public boolean encounterEnemy(int enemyPower, int negotiationSkill) {
        if (negotiationSkill > enemyPower) {
            // TODO: Implement logic and return the appropriate value.
            return true;
        } else {
            // TODO: Implement logic and return the appropriate value.
            return false;
        }
    }

    // Override toString to display current game state
    @Override
    public String toString() {
        return "HeroGame{" +
                "playerX=" + playerX +
                ", playerY=" + playerY +
                ", playerHealth=" + playerHealth +
                ", score=" + score +
                '}';
    }

    // Main method to illustrate gameplay (simplified)
    public static void main(String[] args) {
        HeroGame game = new HeroGame();

        game.movePlayer(0); // Move up
        game.calculateScore();

        if (game.encounterEnemy(30)) {
            System.out.println("Win the fight!");
        } else {
            System.out.println("Lose the fight!");
        }

        // Negotiation encounter with enemy of power 20 and negotiation skill 25
        if (game.encounterEnemy(20, 25)) {
            System.out.println("Negotiation success!");
        } else {
            System.out.println("Negotiation failed!");
        }

        // Display final game state
        System.out.println(game);
    }
}