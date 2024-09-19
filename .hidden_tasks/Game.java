import java.util.Scanner;
import java.util.Set;
import java.util.Random;

public class Game {
    private static final int GRID_SIZE = 5; // Size of the grid
    private static final char EMPTY_CELL = '-';
    private static final char PLAYER_CELL = 'P';
    private static final char ENEMY_CELL = 'E';
    private static final char SCORE_CELL = 'S';

    private char[][] grid;
    private int playerX;
    private int playerY;
    private int playerScore;
    private int[][] enemies; // Array to store enemy positions
    private Random random = new Random();

    public Game() {
        initializeGrid();
    }

    // Initialize the grid and place player and objects
    private void initializeGrid() {
        grid = new char[GRID_SIZE][GRID_SIZE];
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
            grid[enemy[0]][enemy[1]] = ENEMY_CELL;
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
            case 'W':
                if (playerX > 0) playerX--;
                break;
            case 'S':
                if (playerX < GRID_SIZE - 1) playerX++;
                break;
            case 'A':
                if (playerY > 0) playerY--;
                break;
            case 'D':
                if (playerY < GRID_SIZE - 1) playerY++;
                break;
        }
        checkScore();
        grid[playerX][playerY] = PLAYER_CELL; // Update new position
    }

    // Checks for score object on player's position
    private void checkScore() {
        if (grid[playerX][playerY] == SCORE_CELL) {
            updateScore(10); // Fixed points for collecting a score object
        }
    }

    // Move each enemy to a random adjacent cell
    private void moveEnemies() {
        for (int[] enemy : enemies) {
            grid[enemy[0]][enemy[1]] = EMPTY_CELL;
            enemy[0] = (enemy[0] + random.nextInt(3) - 1 + GRID_SIZE) % GRID_SIZE;
            enemy[1] = (enemy[1] + random.nextInt(3) - 1 + GRID_SIZE) % GRID_SIZE;
            grid[enemy[0]][enemy[1]] = ENEMY_CELL;
        }
    }

    // Check for collisions between player and enemies
    private void checkCollisions() {
        for (int[] enemy : enemies) {
            if (enemy[0] == playerX && enemy[1] == playerY) {
                System.out.println("Collision! Game Over.");
                System.exit(0);
            }
        }
    }

    // Game loop
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean isGameRunning = true;
        while (isGameRunning) {
            printGrid();
            System.out.println("Move (WASD): ");
            char move = scanner.next().charAt(0);
            movePlayer(move);
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
        initializeGrid();
    }

    // Reset game with an initial score
    public void resetGame(int initialScore) {
        playerScore = initialScore;
        initializeGrid();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}