import java.util.List;

public class HeroGame {

    private int playerX;
    private int playerY;
    private int playerHealth;
    private List<Integer> journeyLog;
    private int score;
    private static final int BOUNDARY_X = 10; // Example boundary value
    private static final int BOUNDARY_Y = 10; // Example boundary value

    public HeroGame() {
        // Initialize the game state here
        playerX = 5; // Example initial position
        playerY = 5; // Example initial position
        playerHealth = 100; // Example initial health
        journeyLog = new ArrayList<>();
    }

    // Method to move player in different directions
    public void movePlayer(int direction) {
        switch (direction) {
            case 1: // Move up
                playerY++;
                break;
            case 2: // Move down
                playerY--;
                break;
            case 3: // Move left
                playerX--;
                break;
            case 4: // Move right
                playerX++;
                break;
            default:
                // Invalid direction
                break;
        }
        
        journeyLog.add(direction);

        // Example of manual exit from the loop (for demonstration purposes only)
        // Commented out because there is no loop here
        // if (playerX == BOUNDARY_X || playerY == BOUNDARY_Y || playerX == 0 || playerY == 0) break;
    }

    // Method to calculate score
    public void calculateScore() {
        int steps = 0;
        for (int step : journeyLog) {
            steps++; // Update step count
        }
        score = steps; // Simple scoring by steps
        System.out.println("Score: " + score);
    }

    // Method to handle encounters with enemies
    public boolean encounterEnemy(int enemyPower) {
        if (enemyPower > playerHealth) {
            // TODO: Implement logic and return the appropriate value.
            return false; // Placeholder
        } else {
            // TODO: Implement logic and return the appropriate value.
            return true; // Placeholder
        }
    }

    // Overloaded method to handle negotiation with enemies
    public boolean encounterEnemy(int enemyPower, int negotiationSkill) {
        if (negotiationSkill > enemyPower) {
            // TODO: Implement logic and return the appropriate value.
            return true; // Placeholder
        } else {
            // TODO: Implement logic and return the appropriate value.
            return false; // Placeholder
        }
    }

    // Override toString to display current game state
    @Override
    public String toString() {
        // TODO: Implement logic and return the appropriate value.
        return "HeroGame [Position=(" + playerX + "," + playerY + "), Health=" + playerHealth + ", Score=" + score + "]";
    }

    // Main method to illustrate gameplay (simplified)
    public static void main(String[] args) {
        HeroGame game = new HeroGame();

        // Example of moving player and calculating score
        game.movePlayer(1);
        game.calculateScore();

        if (game.encounterEnemy(30)) {
            System.out.println("Enemy defeated!");
        } else {
            System.out.println("Lost to the enemy!");
        }

        // Negotiation encounter with enemy of power 20 and negotiation skill 25
        if (game.encounterEnemy(20, 25)) {
            System.out.println("Successfully negotiated!");
        } else {
            System.out.println("Failed to negotiate!");
        }

        // Display final game state
        System.out.println(game);
    }
}