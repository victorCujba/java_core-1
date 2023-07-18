import chessboard.Chessboard;
import pieces.Piece;

public class Main {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard();
        chessboard.setUp();
        chessboard.show();
        chessboard.addMovement(2, 1, (Piece p) -> p.move(3, 1));
        chessboard.addMovement(8, 2, (Piece p) -> p.move(6, 3));
        chessboard.startGame();

    }
}