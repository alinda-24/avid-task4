public class Enemy {
    private int x, y;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void interact(Player player) {
        if (player.getX() == x && player.getY() == y) {
            player.collectItem(-15); // Decrease score on interaction
        }
    }
    
    public int getX() { return x; }
    public int getY() { return y; }
}