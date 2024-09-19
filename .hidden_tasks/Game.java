import java.util.Scanner;

public class Game {

    private int playerScore;

    public Game() {
        playerScore = 0;
    }

    public boolean playerMeetsEnemy(boolean isPlayerNearby, boolean isEnemyActive) {
        return isPlayerNearby && isEnemyActive;
    }

    public void startGame() {
        boolean isGameRunning = true;
        Scanner scanner = new Scanner(System.in);

        while (isGameRunning) {
            System.out.println("Player is exploring the world...");

            // Simulate player meeting an enemy
            boolean playerNearbyEnemy = (Math.random() > 0.5);
            boolean enemyIsActive = (Math.random() > 0.5);

            if (playerMeetsEnemy(playerNearbyEnemy, enemyIsActive)) {
                System.out.println("An enemy appears!");
                updateScore(10, 5); // Gain 10 points plus a 5-point bonus for engaging the enemy
                System.out.println("Player Score: " + playerScore);
            }

            // Simulate enemy patrol for each game cycle
            enemyPatrol(5);

            // Ask player to continue or quit
            System.out.println("Do you want to continue? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                isGameRunning = false;
            }
        }

        System.out.println("Game Over! Final Score: " + playerScore);
        scanner.close();
    }

    public void enemyPatrol(int steps) {
        for (int i = 0; i < steps; i++) {
            System.out.println("Enemy moves to step " + (i + 1));
        }
    }

    public void updateScore(int points) {
        playerScore += points;
    }

    public void updateScore(int points, int bonus) {
        playerScore += points + bonus;
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}