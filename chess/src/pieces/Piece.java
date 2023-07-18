package pieces;

import exceptions.MovementNotAllowedForPiece;
import exceptions.OutOfChessboardException;

public abstract class Piece {

    protected int x;
    protected int y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract boolean move(int x, int y);

    protected boolean checkBoundaries(int position) {
        return !(position < 1 || position > 8);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
