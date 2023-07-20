import chessboard.Chessboard;
import pieces.Bishop;
import pieces.Color;
import pieces.Pawn;
import pieces.Piece;
import pieces.Rook;

public class Main {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard();

        Piece r = new Bishop(4, 6, Color.BLACK);
        Piece p = new Pawn(3, 7, Color.BLACK);
        chessboard.addPiece(r);
        chessboard.addPiece(p);
        chessboard.show();
        chessboard.addMovement(r, 3, 7);
        chessboard.startGame();

    }
}