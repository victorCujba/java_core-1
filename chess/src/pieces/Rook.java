package pieces;

public class Rook extends Piece {

    public Rook(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public boolean move(int x, int y) {
        if (!((this.x == x && Math.abs(this.y - y) > 0) ||
                (this.y == y && Math.abs(this.x - x) > 0))) {
            return false;
        }
        return super.move(x, y);
    }

    @Override
    public char getChessboardId(){
        if (this.color == Color.BLACK) {
            return '\u265C';
        } else {
            return '\u2656';
        }
    }
}
