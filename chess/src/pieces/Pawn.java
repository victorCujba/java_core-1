package pieces;

public class Pawn extends Piece {

    public Pawn(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public boolean move(int x, int y) {
        if (!((this.y == y) && (Math.abs(this.x - x) == 1))) {
            return false;
        }
        return super.move(x, y);
    }

    @Override
    public char getChessboardId() {
        if (this.color == Color.BLACK) {
            return '\u265F';
        } else {
            return '\u2659';
        }
    }
}
