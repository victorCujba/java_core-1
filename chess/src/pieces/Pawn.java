package pieces;

public class Pawn extends Piece {

    public Pawn(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean move(int x, int y) {
        if (checkBoundaries(x) && checkBoundaries(y)) {
            return false;
        }
        if (!((this.x == x) && (Math.abs(this.y - y) == 1))) {
            return false;
        }
        this.y = y;
        return true;
    }
}
