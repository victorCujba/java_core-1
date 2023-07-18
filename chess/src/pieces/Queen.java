package pieces;

public class Queen extends Piece {

    public Queen(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public boolean move(int x, int y) {
        if (allowedCardinal(x, y) && allowedDiagonal(x, y)) {
            return super.move(x, y);
        } else {
            return false;
        }
    }

    private boolean allowedDiagonal(int x, int y) {
        return Math.abs(this.x - x) == Math.abs(this.y - y);
    }

    private boolean allowedCardinal(int x, int y) {
        return (this.x == x && Math.abs(this.y - y) > 0) ||
                (this.y == y && Math.abs(this.x - x) > 0);
    }

    @Override
    public char getChessboardId(){
        if (this.color == Color.BLACK) {
            return '\u265A';
        } else {
            return '\u2654';
        }
    }
}
