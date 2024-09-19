import java.util.Random;

public class Enemy {
    private int positionX;
    private int positionY;
    private boolean activeStatus;

    public Enemy() {
        this.positionX = 0;
        this.positionY = 0;
        this.activeStatus = true;
    }

    // Overloaded constructor for different difficulty levels
    public Enemy(int positionX, int positionY, boolean activeStatus) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.activeStatus = activeStatus;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isActive() {
        return activeStatus;
    }

    public void toggleActiveStatus() {
        activeStatus = !activeStatus;
    }

    public void moveRandomly() {
        Random random = new Random();
        positionX += random.nextInt(3) - 1; // Random move -1, 0, or 1
        positionY += random.nextInt(3) - 1;
        // Ensure enemy doesn't move out of bounds (Example bounds: 0 to 10)
        positionX = Math.max(0, Math.min(positionX, 10));
        positionY = Math.max(0, Math.min(positionY, 10));
    }
}