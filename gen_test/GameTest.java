package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class class Game {
    private static final int GRID_SIZE = 5;
    Player player;
    List<Enemy> enemies;

    public Game() {
        this.player = new Player();
        this.enemies = new ArrayList<>();
        this.enemies.add(new Enemy(2, 2));
    }

    public boolean updateGameState() {
        // Placeholder for testing method
        return true;
    }

    public void interactWithGame(String command) {
        switch (command) {
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
            default:
                // Do nothing
        }
        player.score = calculateScore();
    }

    public int calculateScore() {
        int score = player.score;

        for (int i = 0; i < player.moves; i++) {
            if (player.x == GRID_SIZE / 2 && player.y == GRID_SIZE / 2) {
                score += 10;
            }
        }
        return score;
    }

    public boolean isEnemyPosition(int x, int y) {
        for (Enemy enemy : enemies) {
            if (enemy.x == x && enemy.y == y) {
                return true;
            }
        }
        return false;
    }

    public void enemyMovement() {
        for (Enemy enemy : enemies) {
            if (player.x == enemy.x && player.y == enemy.y) {
                player.x = 0;
                player.y = 0;
            }
        }
    }

    public void interact(String enemyType) {
        System.out.println("Encountered enemy of type: " + enemyType);
    }

    public void interact(int bonus) {
        player.score += bonus;
    }
}