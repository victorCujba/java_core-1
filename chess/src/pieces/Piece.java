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

    public boolean move(int x, int y) {
        if (!(checkBoundaries(x) && checkBoundaries(y))) {
            return false;
        }
        System.out.printf("Moving %s from position %s:%s to position %s:%s\n", this.getClass().getName(), this.x, this.y, x, y);
        this.x = x;
        this.y = y;
        return true;
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
}
