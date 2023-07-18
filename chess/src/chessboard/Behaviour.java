package chessboard;

import pieces.Piece;

@FunctionalInterface
public interface Behaviour {

    boolean behaviour(Piece p);

}
