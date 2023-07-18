package chessboard;

import pieces.Pawn;
import pieces.Piece;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Chessboard {

    private final List<PieceBehaviourPair> pieceBehaviourPairList;

    public Chessboard() {
        this.pieceBehaviourPairList = new LinkedList<>();
    }

    public void show() {
        for (int x = 1; x <= 8; x++) {
            for (int y = 1; y <= 8; y++) {
                System.out.print("[ ] ");
            }
            System.out.println();
        }
    }

    public void addMovement(Piece p, Behaviour m) {
        this.pieceBehaviourPairList.add(new PieceBehaviourPair(p, m));
    }

    public void startGame() {
        pieceBehaviourPairList.forEach(pair -> {
            if (pair.getBehaviour().behaviour(pair.getPiece())) {
                show();
            }
        });


    }

}
