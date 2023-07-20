package pieces;

public class King extends Piece {

    public King(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public boolean canMove(int x, int y) {
        return allowedOneStep(x, y) && super.canMove(x, y);
    }

    private boolean allowedOneStep(int x, int y) {
        return (Math.abs(this.x - x) <= 1) || (Math.abs(this.y - y) <= 1);
    }

    @Override
    public char getChessboardId(){
        if (this.color == Color.BLACK) {
            return '\u265B';
        } else {
            return '\u2655';
        }
    }
}
