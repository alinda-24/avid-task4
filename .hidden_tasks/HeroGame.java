public class HeroGame {
    private int playerX;
    private int playerY;
    private int playerHealth;
    private int score;
    private static final int BOUNDARY_X = 10;
    private static final int BOUNDARY_Y = 10;
    
    // Constructor to initialize player state
    public HeroGame() {
        this.playerX = 0;
        this.playerY = 0;
        this.playerHealth = 100;
        this.score = 0;
    }

    // Method to move player in different directions
    public void movePlayer(int direction) {
        while (true) { // Infinite loop, needs control to break out (simplified for the purpose of demo)
            switch (direction) {
                case 0: // Move up
                    if (playerY < BOUNDARY_Y) playerY++;
                    break;
                case 1: // Move down
                    if (playerY > 0) playerY--;
                    break;
                case 2: // Move right
                    if (playerX < BOUNDARY_X) playerX++;
                    break;
                case 3: // Move left
                    if (playerX > 0) playerX--;
                    break;
                default: // Invalid direction
                    break;
            }
            // Example of manual exit from the loop (for demonstration purposes only)
            if (playerX == BOUNDARY_X || playerY == BOUNDARY_Y || playerX == 0 || playerY == 0) break;
        }
    }

    // Method to calculate score
    public void calculateScore() {
        int[] journeyLog = new int[] {1, 2, 3, 4, 5}; // Dummy journey log
        int steps = 0;
        for (int step : journeyLog) {
            steps += step;
        }
        score = steps; // Simple scoring by steps
        System.out.println("Score: " + score);
    }

    // Method to handle encounters with enemies
    public boolean encounterEnemy(int enemyPower) {
        if (enemyPower > playerHealth) {
            playerHealth = 0; // Player defeated
            return false;
        } else {
            playerHealth -= enemyPower;
            return true;
        }
    }

    // Overloaded method to handle negotiation with enemies
    public boolean encounterEnemy(int enemyPower, int negotiationSkill) {
        if (negotiationSkill > enemyPower) {
            return true; // Successful negotiation
        } else {
            return encounterEnemy(enemyPower); // Combat as fallback
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

        // Player moves up (0: up)
        game.movePlayer(0);
        System.out.println(game);

        // Calculate score based on journey log
        game.calculateScore();

        // Encounter an enemy with power 30
        if (game.encounterEnemy(30)) {
            System.out.println("Enemy defeated!");
        } else {
            System.out.println("Player lost!");
        }

        // Negotiation encounter with enemy of power 20 and negotiation skill 25
        if (game.encounterEnemy(20, 25)) {
            System.out.println("Negotiation successful!");
        } else {
            System.out.println("Negotiation failed!");
        }

        // Display final game state
        System.out.println(game);
    }
}