import java.util.Random;

public class Player {
    private int positionX;
    private int positionY;
    private int score;

    public Player() {
        this.positionX = 0;
        this.positionY = 0;
        this.score = 0;
    }

    // Overloaded method to move player by dx and dy
    public void move(int dx, int dy) {
        positionX += dx;
        positionY += dy;
        // Ensure player doesn't move out of bounds (Example bounds: 0 to 10)
        positionX = Math.max(0, Math.min(positionX, 10));
        positionY = Math.max(0, Math.min(positionY, 10));
    }

    // Overloaded method to move player in a direction
    public void move(String direction) {
        switch (direction.toUpperCase()) {
            case "UP":
                move(0, 1);
                break;
            case "DOWN":
                move(0, -1);
                break;
            case "LEFT":
                move(-1, 0);
                break;
            case "RIGHT":
                move(1, 0);
                break;
            default:
                System.out.println("Invalid direction!");
        }
    }

    // Simulate collecting points using a while loop
    public void collectPointsWhile(int targets) {
        while (targets > 0) {
            score++;
            targets--;
        }
    }

    // Simulate collecting points using a for loop
    public void collectPointsFor(int rounds) {
        Random random = new Random();
        for (int i = 0; i < rounds; i++) {
            score += random.nextInt(10) + 1; // Random points between 1 and 10
        }
    }

    public int getScore() {
        return score;
    }
}