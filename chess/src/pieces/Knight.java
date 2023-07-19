package pieces;

public class Knight extends Piece {

    public Knight(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public boolean canMove(int x, int y) {
        return (allowedLongXShortY(x, y) || allowedShortXLongY(x, y)) &&
                super.canMove(x, y);
    }

    private boolean allowedShortXLongY(int x, int y) {
        return (Math.abs(this.x - x) == 1) && (Math.abs(this.y - y) == 2);
    }

    private boolean allowedLongXShortY(int x, int y) {
        return (Math.abs(this.x - x) == 2) && (Math.abs(this.y - y) == 1);
    }

    @Override
    public char getChessboardId() {
        if (this.color == Color.BLACK) {
            return '\u265E';
        } else {
            return '\u2658';
        }
    }
}
