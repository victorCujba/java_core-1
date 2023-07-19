package chessboard;

import pieces.*;

import java.util.*;

public class Chessboard {

  private final List<PieceBehaviourPair> pieceBehaviourPairList;
  private final Set<Piece> chessboard;

  public Chessboard() {
    this.pieceBehaviourPairList = new LinkedList<>();
    chessboard = new HashSet<>();
  }

  public void show() {
    for (int y = 1; y <= 8; y++) {
      for (int x = 1; x <= 8; x++) {
        maybePiece(x, y).ifPresentOrElse(
            (Piece p) -> System.out.printf("[%s] ", p.getChessboardId()),
            () -> System.out.print("[ ] ")
        );
      }
      System.out.println();
    }
  }

  private Optional<Piece> maybePiece(int x, int y) {
    return chessboard.stream()
        .filter(p -> (p.getX() == x) && (p.getY() == y))
        .findFirst();
  }

  public void addMovement(Piece p, int x, int y) {
    if (chessboard.contains(p)) {
      this.pieceBehaviourPairList.add(new PieceBehaviourPair(p, x, y));
    }
  }

  public void addMovement(int x, int y, int newX, int newY) {
    maybePiece(x, y).
        ifPresent(p -> pieceBehaviourPairList
            .add(new PieceBehaviourPair(p, newX, newY)));
  }

  public void startGame() {
    pieceBehaviourPairList.forEach(pair -> {
      if (pair.getPiece().canMove(pair.getX(), pair.getY()) &&
        safeFromCollisionOnHorizontalMove(pair.getPiece(), pair.getX(), pair.getY())) {
        System.out.printf("\nMoving %s from position %s:%s to position %s:%s\n",
            pair.getPiece().getClass().getName(),
            pair.getPiece().getX(),
            pair.getPiece().getY(),
            pair.getX(),
            pair.getY());
        pair.getPiece().setX(pair.getX());
        pair.getPiece().setY(pair.getY());
        show();
      }
    });
  }

  public void addPiece(Piece piece) {
    chessboard.add(piece);
  }

  public void setUp() {
    setUpColor(1, Color.WHITE);
    setUpColor(8, Color.BLACK);
  }

  private void setUpColor(int x, Color color) {
    int pawnRow = color == Color.BLACK ? x - 1 : x + 1;
    for (int y = 1; y <= 8; y++) {
      chessboard.add(new Pawn(pawnRow, y, color));
    }
    // set up white pieces
    Piece leftRook = new Rook(x, 1, color);
    Piece leftKnight = new Knight(x, 2, color);
    Piece leftBishop = new Bishop(x, 3, color);
    Piece king = new King(x, 4, color);
    Piece queen = new Queen(x, 5, color);
    Piece rightBishop = new Bishop(x, 6, color);
    Piece rightKnight = new Knight(x, 7, color);
    Piece rightRook = new Rook(x, 8, color);
    chessboard.add(leftRook);
    chessboard.add(leftKnight);
    chessboard.add(leftBishop);
    chessboard.add(king);
    chessboard.add(queen);
    chessboard.add(rightBishop);
    chessboard.add(rightKnight);
    chessboard.add(rightRook);
  }

  public boolean checkCollision(int x, int y) {
    return maybePiece(x, y).isPresent();
  }

  public boolean safeFromCollisionOnHorizontalMove(Piece p, int endX, int endY) {
    int deltaX = endX - p.getX() + 1;
    int deltaY = 0;
    boolean isMoveSafe = true;
    if (deltaX >= 0) {
      for (; deltaX >= 0; deltaX--) {
        isMoveSafe = isMoveSafe && !checkCollision(endX - deltaX, endY - deltaY);
      }
    } else {
      for (; deltaX <= 0; deltaX++) {
        isMoveSafe = isMoveSafe && !checkCollision(endX - deltaX, endY - deltaY);
      }
    }
    return isMoveSafe;
  }
}
