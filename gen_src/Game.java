import java.util.Scanner;
import java.util.Set;
import java.util.Random;

public class Game {

    private static final int GRID_SIZE = 10; // Define the size of the grid
    private static final char PLAYER_CELL = 'P';
    private static final char SCORE_CELL = 'S';
    private static final char EMPTY_CELL = '.';

    private char[][] grid;
    private int playerX, playerY;
    private int playerScore;
    private boolean isGameRunning;
    private int[][] enemies;
    private Random random;
    private Scanner scanner;

    public Game() {
        grid = new char[GRID_SIZE][GRID_SIZE];
        random = new Random();
        scanner = new Scanner(System.in);
        playerScore = 0;
        isGameRunning = true;
        initializeGrid();
    }

    // Initialize the grid and place player and objects
    private void initializeGrid() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = EMPTY_CELL;
            }
        }
        // Set player initial position
        playerX = 0;
        playerY = 0;
        grid[playerX][playerY] = PLAYER_CELL;

        // Place score object on the grid
        grid[random.nextInt(GRID_SIZE)][random.nextInt(GRID_SIZE)] = SCORE_CELL;

        // Initialize enemies at random positions
        enemies = new int[][]{{random.nextInt(GRID_SIZE), random.nextInt(GRID_SIZE)}};
        for (int[] enemy : enemies) {
            grid[enemy[0]][enemy[1]] = 'E'; // assuming 'E' is the enemy cell
        }
    }

    // Print the current grid state
    private void printGrid() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Score: " + playerScore);
    }

    // Move the player based on input direction
    private void movePlayer(char direction) {
        grid[playerX][playerY] = EMPTY_CELL; // Clear current position
        switch (direction) {
            case 'w':
                playerX = Math.max(0, playerX - 1);
                break;
            case 's':
                playerX = Math.min(GRID_SIZE - 1, playerX + 1);
                break;
            case 'a':
                playerY = Math.max(0, playerY - 1);
                break;
            case 'd':
                playerY = Math.min(GRID_SIZE - 1, playerY + 1);
                break;
        }
        checkScore();
        grid[playerX][playerY] = PLAYER_CELL; // Update new position
    }

    // Checks for score object on player's position
    private void checkScore() {
        if (grid[playerX][playerY] == SCORE_CELL) {
            playerScore += 10; // assuming 10 points per score cell
            grid[playerX][playerY] = PLAYER_CELL; // Clear score cell
        }
    }

    // Move each enemy to a random adjacent cell
    private void moveEnemies() {
        for (int[] enemy : enemies) {
            grid[enemy[0]][enemy[1]] = EMPTY_CELL; // Clear current position
            enemy[0] = Math.max(0, Math.min(GRID_SIZE - 1, enemy[0] + random.nextInt(3) - 1));
            enemy[1] = Math.max(0, Math.min(GRID_SIZE - 1, enemy[1] + random.nextInt(3) - 1));
            grid[enemy[0]][enemy[1]] = 'E'; // Update new position
        }
    }

    // Check for collisions between player and enemies
    private void checkCollisions() {
        for (int[] enemy : enemies) {
            if (enemy[0] == playerX && enemy[1] == playerY) {
                isGameRunning = false;
                System.out.println("Game Over! Collision with enemy.");
            }
        }
    }

    // Game loop
    public void startGame() {
        while (isGameRunning) {
            printGrid();
            System.out.print("Enter direction (w/a/s/d): ");
            char direction = scanner.next().charAt(0);
            movePlayer(direction);
            moveEnemies();
            checkCollisions();
        }
        scanner.close();
    }

    // Update score with a fixed number of points
    public void updateScore(int points) {
        playerScore += points;
    }

    // Update score by multiplying current score with a multiplier
    public void updateScore(double multiplier) {
        playerScore *= multiplier;
    }

    // Reset the game state
    public void resetGame() {
        playerScore = 0;
        isGameRunning = true;
        initializeGrid();
    }

    // Reset game with an initial score
    public void resetGame(int initialScore) {
        playerScore = initialScore;
        isGameRunning = true;
        initializeGrid();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}