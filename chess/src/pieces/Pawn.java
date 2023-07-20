package pieces;

public class Pawn extends Piece {

    public Pawn(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public boolean canMove(int x, int y) {
        return allowedStepForward(x, y) && super.canMove(x, y);
    }

    private boolean allowedStepForward(int x, int y) {
        return (this.y == y) && (Math.abs(this.x - x) == 1);
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
