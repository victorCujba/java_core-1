package chessboard;

import pieces.Piece;

public class PieceBehaviourPair {

    private final Piece piece;
    private final Behaviour behaviour;

    public PieceBehaviourPair(Piece piece, Behaviour behaviour) {
        this.piece = piece;
        this.behaviour = behaviour;
    }

    public Piece getPiece() {
        return piece;
    }

    public Behaviour getBehaviour() {
        return behaviour;
    }
}
