package pieces;

public class Rook extends Piece {

    public Rook(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public boolean canMove(int x, int y) {
        return allowedCardinal(x, y) && super.canMove(x, y);
    }

    private boolean allowedCardinal(int x, int y) {
        return (this.x == x && Math.abs(this.y - y) > 0) ||
                (this.y == y && Math.abs(this.x - x) > 0);
    }

    @Override
    public char getChessboardId() {
        if (this.color == Color.BLACK) {
            return '\u265C';
        } else {
            return '\u2656';
        }
    }
}
