package exceptions;

public class MovementNotAllowedForPiece extends Throwable {
    public MovementNotAllowedForPiece(String name) {
        super(name);
    }
}
