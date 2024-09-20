public class Game {
    private int playerPositionX = 0;
    private int playerPositionY = 0;
    private int score = 0;
    private int enemyPositionX = 5;
    private int enemyPositionY = 5;
    private boolean gameRunning = true;

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    public void start() {
        while (gameRunning) {
            updatePlayer();
            updateScore();
            checkEnemyCollision();
            moveEnemy();
            printGameState();
        }
        System.out.println("Game Over");
    }

    private void updatePlayer() {
        // Simulate player movement with dummy input for demonstration
        boolean up = false, down = true, left = false, right = false;
        if (up) playerPositionY -= 1;
        if (down) playerPositionY += 1;
        if (left) playerPositionX -= 1;
        if (right) playerPositionX += 1;
    }

    private void updateScore() {
        boolean playerScored = playerPositionX == 5 && playerPositionY == 5;
        if (playerScored) {
            score += 10;
            System.out.println("Scored 10 points! Total score: " + score);
        }
    }

    private void checkEnemyCollision() {
        boolean hasCollision = playerPositionX == enemyPositionX &&
                               playerPositionY == enemyPositionY;
        if (hasCollision) {
            System.out.println("Collision Detected with Enemy!");
            gameRunning = false; // End the game
        }
    }

    private void moveEnemy(int deltaX, int deltaY) {
        enemyPositionX += deltaX;
        enemyPositionY += deltaY;
    }

    private void moveEnemy() {
        // Default movement, can be randomized or follow a pattern
        moveEnemy(1, 1);
    }

    private void printGameState() {
        System.out.println("Player Position: (" + playerPositionX + ", " + playerPositionY + ")");
        System.out.println("Enemy Position: (" + enemyPositionX + ", " + enemyPositionY + ")");
        System.out.println("Score: " + score);
    }
}