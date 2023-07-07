package oop.inheritance;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return String.format("Il quadrato ha lato %s", super.width);
    }
}
