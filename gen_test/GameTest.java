package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class class Game {

    private int playerScore;

    public Game() {
        playerScore = 0;
    }

    public boolean playerMeetsEnemy(boolean isPlayerNearby, boolean isEnemyActive) {
        return isPlayerNearby && isEnemyActive;
    }

    public void enemyPatrol(int steps) {
        for (int i = 0; i < steps; i++) {
            System.out.println("Enemy moves to step " + (i + 1));
        }
    }

    public void updateScore(int points) {
        if (points < 0) throw new IllegalArgumentException("Points cannot be negative");
        playerScore += points;
    }

    public void updateScore(int points, int bonus) {
        if (bonus < 0) throw new IllegalArgumentException("Bonus cannot be negative");
        updateScore(points + bonus);
    }

    public int getScore() {
        return playerScore;
    }
}