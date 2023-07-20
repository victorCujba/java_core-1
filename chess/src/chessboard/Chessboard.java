package chessboard;

import pieces.*;

import java.util.*;

public class Chessboard {

  private final List<PieceCoordinatesPair> pieceCoordinatesPairList;
  private final Set<Piece> chessboard;

  public Chessboard() {
    this.pieceCoordinatesPairList = new LinkedList<>();
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
      this.pieceCoordinatesPairList.add(new PieceCoordinatesPair(p, x, y));
    }
  }

  public void addMovement(int x, int y, int newX, int newY) {
    maybePiece(x, y).
        ifPresent(p -> pieceCoordinatesPairList
            .add(new PieceCoordinatesPair(p, newX, newY)));
  }

  public void startGame() {
    pieceCoordinatesPairList.forEach(pair -> {
      if (pair.getPiece().canMove(pair.getX(), pair.getY())) {
        Optional<Piece> maybeCollision = safeFromCollision(pair.getPiece(), pair.getX(), pair.getY());
        int endX = pair.getX();
        int endY = pair.getY();
        if (maybeCollision.isPresent()) {
          endX = maybeCollision.get().getX();
          endY = maybeCollision.get().getY();
          chessboard.remove(maybeCollision.get());
        }
        System.out.printf("\nMoving %s from position %s:%s to position %s:%s\n",
            pair.getPiece().getClass().getName(),
            pair.getPiece().getX(),
            pair.getPiece().getY(),
            endX,
            endY);
        pair.getPiece().setX(endX);
        pair.getPiece().setY(endY);
        show();
      } else {
        System.out.println("movement not allowed");
      }
    });
  }

  private Optional<Piece> safeFromCollision(Piece piece, int x, int y) {
    if (piece.getX() - x == 0) {
      return safeFromCollisionOnHorizontalMove(piece, x, y);
    } else if (piece.getY() - y == 0) {
      return safeFromCollisionOnVerticalMove(piece, x, y);
    } else if (Math.abs(piece.getX() - x) == Math.abs(piece.getY() - y)) {
      return safeFromCollisionOnDiagonalMove(piece, x, y);
    } else {
      return Optional.empty();
    }
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

  public Optional<Piece> safeFromCollisionOnHorizontalMove(Piece p, int endX, int endY) {
    int deltaX = endX - p.getX() + 1;
    int deltaY = 0;
    Optional<Piece> maybeCollision = Optional.empty();
    if (deltaX >= 0) {
      for (; deltaX >= 0; deltaX--) {
        maybeCollision = maybePiece(endX - deltaX, endY - deltaY);
      }
    } else {
      for (; deltaX <= 0; deltaX++) {
        maybeCollision = maybePiece(endX - deltaX, endY - deltaY);
      }
    }
    return maybeCollision;
  }

  public Optional<Piece> safeFromCollisionOnVerticalMove(Piece p, int endX, int endY) {
    int deltaX = 0;
    int deltaY = endY - p.getY() - 1;
    Optional<Piece> maybeCollision = Optional.empty();
    if (deltaY >= 0) {
      for (; deltaY >= 0; deltaY--) {
        maybeCollision = maybePiece(endX - deltaX, endY - deltaY);
      }
    } else {
      for (; deltaY <= 0; deltaY++) {
        maybeCollision = maybePiece(endX - deltaX, -endY - deltaY);
      }
    }
    return maybeCollision;
  }

  private Optional<Piece> safeFromCollisionOnDiagonalMove(Piece p, int endX, int endY) {
    int deltaX = endX - p.getX();
    int deltaY = endY - p.getY();
    Optional<Piece> maybeCollision = Optional.empty();
    if (deltaY < 0 && deltaX > 0) {
      deltaX--;
      deltaY++;
      for (; deltaY <= 0 && deltaX >= 0; deltaY++, deltaX--) {
        maybeCollision = maybePiece(endX - deltaX, endY - deltaY);
      }
    } else if (deltaY < 0 && deltaX < 0) {
      deltaX++;
      deltaY++;
      for (; deltaY <= 0 && deltaX <= 0; deltaY++, deltaX++) {
        maybeCollision = maybePiece(endX - deltaX, endY - deltaY);
      }
    } else if (deltaY > 0 && deltaX < 0) {
      deltaX++;
      deltaY--;
      for (; deltaY >= 0 && deltaX <= 0; deltaY--, deltaX++) {
        maybeCollision = maybePiece(endX - deltaX, endY - deltaY);
      }
    } else if (deltaY > 0 && deltaX > 0) {
      deltaX--;
      deltaY--;
      for (; deltaY >= 0 && deltaX >= 0; deltaY--, deltaX--) {
        maybeCollision = maybePiece(endX - deltaX, endY - deltaY);
      }
    }
    return maybeCollision;
  }
}
