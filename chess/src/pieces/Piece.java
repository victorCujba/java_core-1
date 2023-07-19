package pieces;

public abstract class Piece {

    protected int x;
    protected int y;
    protected final Color color;

    public Piece(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public boolean canMove(int x, int y) {
        return checkBoundaries(x) && checkBoundaries(y);
    }

    public abstract char getChessboardId();

    protected boolean checkBoundaries(int position) {
        return position >= 1 && position <= 8;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
}
