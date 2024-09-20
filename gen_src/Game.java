import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private static final int GRID_SIZE = 5;
    private Player player;
    private List<Enemy> enemies;
    private Scanner scanner;

    public Game() {
        // TODO: Implement this method.
    }

    public void startGame() {
        // TODO: Implement this method.
    }

    private boolean updateGameState() {
        // TODO: Implement this method.
        return false;
    }

    private int calculateScore() {
        // TODO: Implement this method.
        return 0;
    }

    private void displayBoard() {
        // TODO: Implement this method.
    }

    private boolean isEnemyPosition(int x, int y) {
        // TODO: Implement this method.
        return false;
    }

    private void enemyMovement() {
        // TODO: Implement this method.
    }

    public void interact(String enemyType) {
        // TODO: Implement this method.
    }

    public void interact(int bonus) {
        // TODO: Implement this method.
    }

    public static void main(String[] args) {
        // TODO: Implement this method.
    }
}

class Player {
    int x, y, moves, score;

    public Player() {
        // TODO: Implement this method.
    }
}

class Enemy {
    int x, y;

    public Enemy(int x, int y) {
        // TODO: Implement this method.
    }
}