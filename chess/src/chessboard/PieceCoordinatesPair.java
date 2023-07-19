package chessboard;

import pieces.Piece;

public class PieceCoordinatesPair {

    private final Piece piece;
    private final int x;
    private final int y;

    public PieceCoordinatesPair(Piece piece, int x, int y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
