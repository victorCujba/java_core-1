package pieces;

public class Bishop extends Piece {


    public Bishop(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public boolean canMove(int x, int y) {
        return allowedDiagonal(x, y) && super.canMove(x, y);
    }

    private boolean allowedDiagonal(int x, int y) {
        return Math.abs(this.x - x) == Math.abs(this.y - y);
    }

    @Override
    public char getChessboardId(){
        if (this.color == Color.BLACK) {
            return '\u265D';
        } else {
            return '\u2657';
        }
    }

}
