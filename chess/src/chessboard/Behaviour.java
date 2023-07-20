package chessboard;

import pieces.Piece;

@FunctionalInterface
public interface Behaviour {

    boolean checkMovement(Piece p);

}
