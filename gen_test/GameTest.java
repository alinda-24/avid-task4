package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class class Game {
    private int playerX, playerY;
    private int score;
    private int enemyX, enemyY;
    private boolean isGameOver;
    private static final Random random = new Random();

    public Game() {
        this.playerX = 0;
        this.playerY = 0;
        this.enemyX = random.nextInt(100);
        this.enemyY = random.nextInt(100);
        this.score = 0;
        this.isGameOver = false;
    }

    public int getPlayerX() {
        return playerX;
    }

    public int getPlayerY() {
        return playerY;
    }

    public int getScore() {
        return score;
    }

    public int getEnemyX() {
        return enemyX;
    }

    public int getEnemyY() {
        return enemyY;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void movePlayer(int x, int y) {
        if(x < 0 || y < 0) throw new IllegalArgumentException("Coordinates cannot be negative");
        this.playerX += x;
        this.playerY += y;
    }

    public void playerShoots() {
        this.score++;
    }

    public void enemyShoots(boolean hit) {
        if (hit) {
            this.isGameOver = true;
        }
    }

    public void startNewGame() {
        this.playerX = 0;
        this.playerY = 0;
        this.enemyX = random.nextInt(100);
        this.enemyY = random.nextInt(100);
        this.score = 0;
        this.isGameOver = false;
    }
}