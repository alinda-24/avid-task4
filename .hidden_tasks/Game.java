import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private static final int GRID_SIZE = 5;
    private Player player;
    private List<Enemy> enemies;
    private Scanner scanner;

    public Game() {
        this.player = new Player();
        this.enemies = new ArrayList<>();
        this.enemies.add(new Enemy(2, 2));
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        boolean isGameRunning = true;

        while (isGameRunning) {
            displayBoard();
            isGameRunning = updateGameState();
            enemyMovement();

            if (player.moves >= 20) {
                isGameRunning = false;
                System.out.println("Game Over! Final Score: " + player.score);
            }
        }

        scanner.close();
    }

    private boolean updateGameState() {
        System.out.println("Enter your move (WASD to move, Q to quit): ");
        String move = scanner.nextLine().toUpperCase();

        switch (move) {
            case "W":
                if (player.y > 0) {
                    player.y -= 1;
                    player.moves++;
                }
                break;
            case "A":
                if (player.x > 0) {
                    player.x -= 1;
                    player.moves++;
                }
                break;
            case "S":
                if (player.y < GRID_SIZE - 1) {
                    player.y += 1;
                    player.moves++;
                }
                break;
            case "D":
                if (player.x < GRID_SIZE - 1) {
                    player.x += 1;
                    player.moves++;
                }
                break;
            case "Q":
                return false;
            default:
                System.out.println("Invalid move. Try again.");
        }

        player.score = calculateScore();
        return true;
    }

    private int calculateScore() {
        int score = player.score;
        
        for (int i = 0; i < player.moves; i++) {
            if (player.x == GRID_SIZE / 2 && player.y == GRID_SIZE / 2) {
                score += 10;
            }
        }
        return score;
    }

    private void displayBoard() {
        for (int y = 0; y < GRID_SIZE; y++) {
            for (int x = 0; x < GRID_SIZE; x++) {
                if (player.x == x && player.y == y) {
                    System.out.print("P ");
                } else if (isEnemyPosition(x, y)) {
                    System.out.print("E ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println("Score: " + player.score + " | Moves: " + player.moves);
    }

    private boolean isEnemyPosition(int x, int y) {
        for (Enemy enemy : enemies) {
            if (enemy.x == x && enemy.y == y) {
                return true;
            }
        }
        return false;
    }

    private void enemyMovement() {
        for (Enemy enemy : enemies) {
            if (player.x == enemy.x && player.y == enemy.y) {
                System.out.println("Oh no! You've been caught by an enemy!");
                // Reset player position
                player.x = 0;
                player.y = 0;
            }
        }
    }

    public void interact(String enemyType) {
        System.out.println("Encountered enemy of type: " + enemyType);
    }

    public void interact(int bonus) {
        System.out.println("Collected bonus of " + bonus + " points!");
        player.score += bonus;
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}