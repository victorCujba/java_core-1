package pieces;

public class King extends Piece {

    public King(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public boolean move(int x, int y) {
        if ( !(Math.abs(this.x - x) <= 1) || (Math.abs(this.y - y) <= 1) ){
            return false;
        }
        return super.move(x, y);
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
