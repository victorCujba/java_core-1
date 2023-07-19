import chessboard.Chessboard;
import pieces.Color;
import pieces.Pawn;
import pieces.Piece;
import pieces.Rook;

public class Main {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard();

        Piece p = new Rook(7, 2, Color.BLACK);
        Piece p1 = new Pawn(3, 2, Color.BLACK);
        chessboard.addPiece(p);
//        chessboard.addPiece(p1);
        chessboard.show();
        chessboard.addMovement(p, 2, 2);
        chessboard.startGame();

    }
}