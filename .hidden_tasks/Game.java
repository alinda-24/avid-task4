import java.util.Random;

public class Game {
    private int playerX, playerY;
    private int score;
    private int enemyX, enemyY;
    private boolean isGameOver;

    private static final Random random = new Random();

    /**
     * Constructor for the Game 