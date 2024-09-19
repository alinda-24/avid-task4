public class Player {
    private int x, y;
    private int score;

    public Player() {
        this.x = 0;
        this.y = 0;
        this.score = 0;
    }
    
    public void moveUp() {
        if (y > 0) y--;
    }
    
    public void moveDown(int gridSize) {
        if (y < gridSize - 1) y++;
    }

    public void moveLeft() {
        if (x > 0) x--;
    }

    public void moveRight(int gridSize) {
        if (x < gridSize - 1) x++;
    }
    
    public void collectItem() {
        score += 10; // Default item score
    }
    
    public void collectItem(int bonus) {
        score += bonus; // Bonus item score
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getScore() { return score; }
}