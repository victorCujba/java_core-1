package pieces;

public class Bishop extends Piece {


    public Bishop(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public boolean move(int x, int y) {
        if ( !(Math.abs(this.x - x) == Math.abs(this.y - y)) ){
            return false;
        }
        return super.move(x, y);
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
